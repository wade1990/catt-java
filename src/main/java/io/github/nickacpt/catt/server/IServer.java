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

import java.util.Collection;

/**
 * Represents the server that's going to handle device connections.
 */
public interface IServer {

    /**
     * Gets the connected devices to this server.
     * @return The connections that are active
     */
    Collection<IConnection> getConnections();

    /**
     * Starts listening for connections.
     */
    void startListening();

    /**
     * Stops the server's connection listener and closes all connected connections.
     */
    void stop();

    /**
     * Add a packet transport to this server.
     * @param transport The transport to add
     */
    void addTransport(ITransport transport);

    /**
     * Check whether the server has already started.
     * @return <tt>true</tt> if the server already started, <tt>false</tt> otherwise
     */
    boolean hasStarted();

}
