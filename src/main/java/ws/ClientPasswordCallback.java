package ws;

import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.springframework.stereotype.Component;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;

/**
 * @author Kang
 * @create 2017-09-06 15:41
 */
@Component
public class ClientPasswordCallback implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        WSPasswordCallback callback = (WSPasswordCallback) callbacks[0];
        callback.setPassword("Hfzx7bx5B7GqQALUnRao3B612QNq0pAP"); //key 的密码
    }
}
