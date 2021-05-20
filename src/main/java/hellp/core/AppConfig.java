package hellp.core;

import hellp.core.discount.DiscountPolicy;
import hellp.core.discount.FixDiscountPolicy;
import hellp.core.discount.RateDiscountPolicy;
import hellp.core.member.MemberService;
import hellp.core.member.MemberServiceImpl;
import hellp.core.member.MemoryMemberRepository;
import hellp.core.order.OrderService;
import hellp.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    //ctrl+alt+M
    @Bean
    public MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), discountPolicy());
    } //ctrl+alt+M

    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}



