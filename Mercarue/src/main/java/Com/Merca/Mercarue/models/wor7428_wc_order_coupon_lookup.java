package Com.Merca.Mercarue.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class wor7428_wc_order_coupon_lookup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column( columnDefinition = "bigint(20)")
	private Long order_id;
	
	 @Column( columnDefinition = "bigint(20)")
		private Long coupon_id;
	 
	 LocalDateTime date_created ;
double discount_amount;
}
