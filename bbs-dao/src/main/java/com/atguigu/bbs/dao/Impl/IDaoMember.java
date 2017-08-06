package com.atguigu.bbs.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atguigu.bbs.dao.DaoMember;
import com.atguigu.bbs.dao.mapper.MemberMapper;
import com.atguigu.bbs.pojo.Member;

/**
 * @ClassName IDaoMember
 * @author Administrator
 * @Date 2017年8月6日 下午12:12:22
 * @version 1.0.0
 */
@Component
public class IDaoMember implements DaoMember{

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public Member findMemberByUid(Long uid) throws Exception {
        return memberMapper.findMemberByUid(uid);
    }

    @Override
    public Member findMemberByMemberId(Integer memberId) throws Exception {
        return memberMapper.findMemberByMemberId(memberId);
    }
}
