package uniform.sale.domain.login;

import lombok.Data;

@Data
public class Login {

    private String email;
    private String password;

    public Login(String email,String password) {
        this.email = email;
        this.password = password;
    }
}
