package uniform.sale.domain.login;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uniform.sale.domain.member.Member;
import uniform.sale.domain.member.MemberRepository;

@Service
@Slf4j
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    public Login login(Login login) {
        Member findMember = memberRepository.findByEmail(login.getEmail());
        return new Login(findMember.getEmail(),findMember.getPassword());

    }

}
