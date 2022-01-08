package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); // Optional : null이 들어오는 예외 경우를 위한....
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
