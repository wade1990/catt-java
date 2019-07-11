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

import java.util.UUID;

/**
 * Represents a connected device.
 */
public interface IDevice {

    /**
     * Gets the Unique ID assigned to this device.
     * @return The Unique ID assigned to this device
     */
    UUID getUniqueId();

    /**
     * Gets the name assigned to this device.
     * @return The name assigned to this device
     */
    String getDeviceName();

    /**
     * Gets the public key used by this device. Used for packet decryption.
     * @return The Public Key used by this device
     */
    byte[] getPublicKey();

}
