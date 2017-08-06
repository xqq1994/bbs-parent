package com.atguigu.bbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bbs.dao.Impl.IDaoMember;
import com.atguigu.bbs.pojo.Member;
/**
 * @ClassName MemberService
 * @author Administrator
 * @Date 2017年8月6日 下午12:19:51
 * @version 1.0.0
 */
@Service
public class MemberService implements IMemberService{

    @Autowired
    private IDaoMember daoMember;

    @Override
    public Member findMemberByUid(Long uid) throws Exception {
        return daoMember.findMemberByUid(uid);
    }

    @Override
    public Member findMemberByMemberId(Integer memberId) throws Exception {
        return daoMember.findMemberByMemberId(memberId);
    }
}
