package com.local_chat.local_chat.DTO.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Schema(description = "SignUp Request")
public class SignUpRequest {
    @Schema(description = "Username", example = "Jon")
    @Size(min = 5, max = 50, message = "Must contain min 5 letters")
    @NotBlank(message = "Username mustn't be blanked")
    private String username;

    @Schema(description = "Password", example = "my_1secret1_password")
    @Size(max = 255, message = "Must be 255 max symbols")
    @NotBlank(message = "Password mustn't be blanked")
    private String password;
}
