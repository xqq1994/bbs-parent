package com.atguigu.bbs.service;

import com.atguigu.bbs.pojo.Member;

/**
 * @ClassName IMemberService
 * @author Administrator
 * @Date 2017年8月6日 下午12:19:25
 * @version 1.0.0
 */
public interface IMemberService {

    Member findMemberByUid(Long uid) throws Exception;

    Member findMemberByMemberId(Integer memberId) throws Exception;


}
