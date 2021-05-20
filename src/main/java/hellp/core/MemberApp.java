package hellp.core;

import hellp.core.member.Grade;
import hellp.core.member.Member;
import hellp.core.member.MemberService;
import hellp.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {

//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
        //MemberService memberService = new MemberServiceImpl(memberRepository);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember =memberService.findMember(1L);

        System.out.println("new member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());


    }
}
