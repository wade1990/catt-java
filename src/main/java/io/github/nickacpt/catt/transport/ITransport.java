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
package io.github.nickacpt.catt.transport;

import org.jetbrains.annotations.NotNull;

public interface ITransport {

    /**
     * Get the name of this transport.
     * @return The name of this transport
     */
    @NotNull
    String getName();

    /**
     * Get the availability of this transport
     * @return The availability of this transport
     */
    boolean isAvailable();

    /**
     * Get whether this transport has device discovery built-in
     * @return <tt>true</tt> if this transport has device discovery built-in, <tt>false</tt> otherwise
     */
    boolean hasDeviceDiscovery();

    /**
     * Start listening on this transport instance
     */
    void startListening();

    /**
     * Stop listening on this transport instance
     */
    void stopListening();

}
