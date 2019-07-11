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
package io.github.nickacpt.catt.discovery;

import io.github.nickacpt.catt.devices.IDevice;

/**
 * Callback interface for handling discovered devices.
 */
public interface IDeviceDiscoveryHandler {

    /**
     * Handler for when a device is discovered.
     * @param device The discovered device
     */
    void onDeviceDiscovered(IDevice device);

    /**
     * Handler for when a device is lost.
     * @param device The device that got lost
     */
    void onDeviceLost(IDevice device);

}
