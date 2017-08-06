package com.atguigu.bbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.bbs.pojo.Member;
import com.atguigu.bbs.service.IMemberService;

/**
 * @ClassName MemberController
 * @author Administrator
 * @Date 2017年8月6日 下午12:27:32
 * @version 1.0.0
 */
@RestController
public class MemberController {

    @Autowired
    private IMemberService memberService;

    @RequestMapping("/member/{memberId}")
    Member findMemberByMemberId(@PathVariable("memberId") Integer memberId) throws Exception{
       return memberService.findMemberByMemberId(memberId);
    }



}
