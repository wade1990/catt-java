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
package io.github.nickacpt.catt.transports.tcp.server;

import com.gilecode.yagson.YaGson;
import com.gilecode.yagson.YaGsonBuilder;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoder;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

import java.nio.charset.StandardCharsets;

public class JsonProtocolEncoder implements ProtocolEncoder {

    private YaGson gson;

    public JsonProtocolEncoder() {
        gson = new YaGsonBuilder()
                .disableHtmlEscaping()
                .create();
    }

    @Override
    public void encode(IoSession session, Object message, ProtocolEncoderOutput out) throws Exception {
        String s = gson.toJson(message);
        IoBuffer buffer = IoBuffer.allocate(s.length()).setAutoExpand(true);
        buffer.put(s.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public void dispose(IoSession session) throws Exception {

    }
}
