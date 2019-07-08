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

import io.github.nickacpt.catt.transport.ITransport;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Transport Manager - Used to register and get all transport instances.
 */
public class TransportManager {
    private List<ITransport> registeredTransports;
    //region Singleton
    private static TransportManager instance;

    private TransportManager() {
        registeredTransports = new ArrayList<>();
    }

    /**
     * Get the global <tt>TransportManager</tt> instance.
     *
     * @return The global instance of TransportManager
     */
    public static TransportManager getInstance() {
        if (instance == null) instance = new TransportManager();
        return instance;
    }
    //endregion

    /**
     * Register an instance of a transport
     *
     * @param transport The transport instance to register.
     * @return <tt>true</tt> if registered correctly, false otherwise
     */
    public boolean registerTransport(@NotNull ITransport transport)
    {
        return registeredTransports.add(transport);
    }

    /**
     * Unregister an instance of a transport
     *
     * @param transport The transport instance to unregister.
     * @return <tt>true</tt> if unregistered correctly, <tt>false</tt> otherwise
     */
    public boolean unregisterTransport(@NotNull ITransport transport) {
        return registeredTransports.remove(transport);
    }

    public List<ITransport> getTransports() {
        return Collections.unmodifiableList(registeredTransports);
    }

}
