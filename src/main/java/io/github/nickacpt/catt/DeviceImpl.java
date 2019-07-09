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
package io.github.nickacpt.catt;

import java.util.UUID;

public class DeviceImpl implements IDevice {
    private UUID uuid;
    private String name;
    private byte[] publicKey;

    public DeviceImpl(UUID uuid, String name, byte[] publicKey) {
        this.uuid = uuid;
        this.name = name;
        this.publicKey = publicKey;
    }

    @Override
    public UUID getUniqueId() {
        return uuid;
    }

    @Override
    public String getDeviceName() {
        return name;
    }

    @Override
    public byte[] getPublicKey() {
        return publicKey;
    }
}
