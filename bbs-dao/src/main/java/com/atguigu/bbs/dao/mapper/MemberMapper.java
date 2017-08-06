package com.atguigu.bbs.dao.mapper;

import org.apache.ibatis.annotations.Param;

import com.atguigu.bbs.pojo.Member;


public interface MemberMapper {

    Member findMemberByUid(@Param("uid") Long uid) throws Exception;

    Member findMemberByMemberId(@Param("employee_id") Integer memberId) throws Exception;

}
