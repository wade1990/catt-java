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

import io.github.nickacpt.catt.devices.IDevice;

import java.util.List;

public class CATTServer implements IServer {

    @Override
    public List<IDevice> getConnectedDevices() {
        return null;
    }

    @Override
    public void startListening() {

    }

    @Override
    public void stop() {

    }
}
