package Butlers.Ticat.interest.service;

import Butlers.Ticat.interest.entity.Interest;
import Butlers.Ticat.interest.repository.InterestRepository;
import Butlers.Ticat.member.entity.Member;
import Butlers.Ticat.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InterestService {

    private final MemberService memberService;
    private final InterestRepository interestRepository;

    // 관심사 등록
    public Interest registerInterest(Interest interest) {
        Member member = memberService.findVerifiedMember(interest.getMember().getMemberId());
        member.setDisplayName(interest.getMember().getDisplayName());
        Interest memberInterest = member.getInterest();
        memberInterest.setCategories(interest.getCategories());

        return interestRepository.save(memberInterest);
    }

    // 관심사 수정
    public Interest updateInterest(Interest interest, long memberId) {
        Interest findedInterest = interestRepository.findByMemberMemberId(memberId);
        findedInterest.setCategories(interest.getCategories());

        return interestRepository.save(findedInterest);
    }

    // 관심사 조회
    public Interest getInterestByMemberId(long memberId) {
        return interestRepository.findByMemberMemberId(memberId);
    }
}
