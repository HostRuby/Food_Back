package dr.foody.user.dto;

import lombok.Data;

@Data
public class UserDto {
    private Integer user_idx;
    private String email;
    private String username;
    private String password;
}
