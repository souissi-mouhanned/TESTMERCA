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
public class wor7428_wc_order_stats {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column( columnDefinition = "bigint(20)")
	private Long order_id;
	
	 @Column( columnDefinition = "bigint(20)")
		private Long customer_id;
	 
	 @Column( columnDefinition = "bigint(20)")
		private Long parent_id;
	 
	 @Column( columnDefinition = "int(20)")
		private Long num_items_sold;
	 
	 @Column(columnDefinition = "VARCHAR(191) COLLATE utf8mb4_unicode_520_ci")
	 String status ;
	 
	 double total_sales ;
	 double tax_total ;
	 double shipping_total ;
	 double net_total ;
	 
		LocalDateTime 	 date_created ;
		
		 @Column( columnDefinition = "tinyint(1)")
			private Long returning_customer;

	 
}
