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

import io.github.nickacpt.catt.server.CATTServer;

import java.util.Scanner;

import static java.lang.System.out;

public class SampleServerApp {

    public static void main(String[] args) {
        out.println("Started test app CATT server...");
        out.println("");

        CATTServer server = new CATTServer();

        server.startListening();

        Scanner scanner = new Scanner(System.in);
        for (String line; (line = scanner.nextLine()) != null; ) {
            if (line.equalsIgnoreCase("quit") || line.equalsIgnoreCase("stop")) {
                System.exit(0);
            }
        }
    }

}
