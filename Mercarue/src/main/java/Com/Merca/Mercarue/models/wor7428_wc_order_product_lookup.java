package Com.Merca.Mercarue.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table 
public class wor7428_wc_order_product_lookup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column( columnDefinition = "bigint(20)")
	private Long order_item_id;
	
	 @Column( columnDefinition = "bigint(20)")
		private Long order_id;
	 
	 @Column( columnDefinition = "bigint(20)")
		private Long product_id;
	 
	 @Column( columnDefinition = "bigint(20)")
		private Long variation_id;
	 
	 @Column( columnDefinition = "bigint(20)")
		private Long customer_id;
	 @Column( columnDefinition = "int(11)")
		private Long product_qty;
	 
	 LocalDateTime date_created ;
	 
	 double product_net_revenue ;
	 
	 double product_gross_revenue ;
	 
	 double coupon_amount ;
	 
	 double tax_amount ;
	 
	 double shipping_amount ;
	 
	 double shipping_tax_amount ;

}
