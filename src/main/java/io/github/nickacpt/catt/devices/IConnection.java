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
package io.github.nickacpt.catt.devices;

import io.github.nickacpt.catt.packets.IPacket;

/**
 * Represents a connection.
 */
public interface IConnection {

    /**
     * Gets the connected device.
     * @return The connected device
     */
    IDevice getDevice();

    /**
     * Gets whether this connection is still active.
     * @return <tt>true</tt> if the connection is still active, <tt>false</tt> otherwise
     */
    boolean isConnected();

    /**
     * Send a packet to the connected device.
     * @param packet The packet to send
     */
    void sendPacket(IPacket packet);

}
