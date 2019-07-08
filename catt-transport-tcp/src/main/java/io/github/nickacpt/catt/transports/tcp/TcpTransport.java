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
package io.github.nickacpt.catt.transports.tcp;

import io.github.nickacpt.catt.transport.ITransport;
import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;

public class TcpTransport implements ITransport {
    @Override
    public @NotNull String getName() {
        return "TCP";
    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public boolean hasDeviceDiscovery() {
        return false;
    }

    @Override
    public void startListening() {
        IoAcceptor acceptor = new NioSocketAcceptor();
        acceptor.getFilterChain().addLast( "codec", new ProtocolCodecFilter( new TextLineCodecFactory(StandardCharsets.UTF_8)));
    }

    @Override
    public void stopListening() {

    }
}
