/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package io.github.nickacpt.catt.sample;

import io.github.nickacpt.catt.server.CattServer;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class SampleServerApp {

    public static void main(String[] args) {
        out.println("Started test app CATT server...");
        out.println("");

        CattServer server = new CattServer();
        server.startListening();

        Scanner scanner = new Scanner(System.in);
        for (String line; (line = getLine(scanner)) != null; ) {
            if (line.isEmpty() || line.equalsIgnoreCase("quit") || line.equalsIgnoreCase("stop")) {
                System.exit(0);
                return;
            }
            if (line.startsWith("srv>")) {
                try {
                    switch (line.substring("srv>".length()).toLowerCase()) {
                        case "start":
                            server.startListening();
                            out.println("Started listening!");
                            break;
                        case "stop":
                            server.stop();
                            out.println("Stopped listening!");
                            break;
                        case "connections":
                            out.printf("Connections: [%s]%n", String.join(", ",
                                    server.getConnections().stream()
                                            .map(m -> String.format("[%s, %s]", m.getDevice().getDeviceName(),
                                                    m.isConnected()))
                                            .collect(Collectors.toCollection(ArrayList::new))));
                            break;
                    }
                } catch (Exception e) {
                    out.println("Error occurred whilst running your command: " + e.getMessage());
                }
            }
        }
    }

    private static String getLine(Scanner scanner) {
        try {
            return scanner.nextLine();
        } catch (Exception e) {
            return "";
        }
    }
}
