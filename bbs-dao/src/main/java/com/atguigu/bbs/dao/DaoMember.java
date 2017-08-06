package com.atguigu.bbs.dao;

import com.atguigu.bbs.pojo.Member;

/**
 * @ClassName DaoMember
 * @author Administrator
 * @Date 2017年8月6日 下午12:09:13
 * @version 1.0.0
 */
public interface DaoMember {

    Member findMemberByUid(Long uid) throws Exception;

    Member findMemberByMemberId(Integer memberId) throws Exception;

}
