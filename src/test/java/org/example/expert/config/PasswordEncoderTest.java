package org.example.expert.config;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
class PasswordEncoderTest {


    @InjectMocks //=  Mockito 프레임워크에서 사용되는 어노테이션으로
    //테스트 클래스에서 의존성 주입을 자동으로 처리해주는 역할을 한다.
    private PasswordEncoder passwordEncoder;

    @Test
    void matches_메서드가_정상적으로_동작한다() {

        // given
        String rawPassword = "testPassword";
        String encodedPassword = passwordEncoder.encode(rawPassword);

        // when
        boolean matches = passwordEncoder.matches( rawPassword,encodedPassword);//matches() 메서드는 첫 번째 인수로 평문 비밀번호를, 두 번째 인수로 암호화된 비밀번호를 받아서 비교


        // then
        assertTrue(matches);
    }
}
