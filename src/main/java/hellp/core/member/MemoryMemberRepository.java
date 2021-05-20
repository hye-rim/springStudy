package hellp.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> story = new HashMap<>();

    @Override
    public void save(Member member) {
        story.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return story.get(memberId);
    }
}
