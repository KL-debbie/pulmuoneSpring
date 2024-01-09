package org.pro.pulmuone.controller.coupon;

import java.security.Principal;
import java.util.List;

import org.pro.pulmuone.domain.order.HaveCouponDTO;
import org.pro.pulmuone.service.coupon.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/*")
public class CouponController {
	
	@Autowired
	private CouponService couponService;

	@GetMapping("mypage/benefit/coupon")
	public String couponlist(Model model, Principal principal) {
		
	    // ����� id ��������
	    String memberId = principal.getName();

	    // member_no ����
	    int memberNo = couponService.getMemberInfo(memberId);

	    // ������� ���� ����� �����ɴϴ�.
	    List<HaveCouponDTO> coupons = couponService.getCoupons(memberNo);
	    System.out.println("coupons result:" + coupons);
	    model.addAttribute("coupons", coupons);
	    
	    
		/* List<CouponDTO> coupons = couponService.getCouponInfo(memberNo); */

	    // ������� �̸��� �����ɴϴ�.
	    String name = couponService.getUserName(memberNo);
	    System.out.println("name result:" + name);
	    model.addAttribute("name", name);

	    return "mypage/benefit/coupon.tiles";
	}

}
