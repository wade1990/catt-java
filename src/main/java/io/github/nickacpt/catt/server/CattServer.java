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
package io.github.nickacpt.catt.server;

import io.github.nickacpt.catt.devices.IConnection;
import io.github.nickacpt.catt.transport.ITransport;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static java.lang.String.format;

public class CattServer implements IServer {
    private boolean started;
    private ArrayList<IConnection> connections = new ArrayList<>();

    @Override
    public Collection<IConnection> getConnections() {
        return Collections.unmodifiableCollection(connections);
    }

    @Override
    public void startListening() {
        throwIfStarted(true);
        started = true;
    }

    @Override
    public void stop() {
        throwIfStarted(false);
        started = false;
    }

    @Override
    public void addTransport(ITransport transport) {
        throwIfStarted(false);
    }

    private void throwIfStarted() {
        throwIfStarted(true);
    }

    private void throwIfStarted(boolean started) {
        if (hasStarted() == started)
            throw new RuntimeException(format("Server has%s already been started", !started ? "n't" : ""));
    }

    @Override
    public boolean hasStarted() {
        return started;
    }
}
