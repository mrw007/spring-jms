package mrw007.springframework.springjms.models;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldMessage implements Serializable {

    static final long serialVersionUID = 3423724238882572927L;

    private UUID id;
    private String message;
}
