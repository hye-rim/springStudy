package hellp.core.discount;

import hellp.core.member.Grade;
import hellp.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPercent /100;
        }else {
            return 0;
        } //TestCode 단축키 :  ctrl+shift+T
    }
}
