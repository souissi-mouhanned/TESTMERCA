package Com.Merca.Mercarue.models;

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
public class wor7428_wc_product_meta_lookup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	@Column( columnDefinition = "bigint(20)")
	private Long product_id;
	  
		@Column( columnDefinition = "tinyint(1) ")
		private Long virtual;
		  
		@Column( columnDefinition = "tinyint(1) ")
		private Long downloadable;
		  
		@Column( columnDefinition = "decimal(19,4)")
		private Long min_price;
		  
		@Column( columnDefinition = "decimal(19,4)")
		private Long max_price;
		  
		@Column( columnDefinition = "tinyint(1) ")
		private Long onsale;
		  
		@Column( columnDefinition = "bigint(20)")
		private Long rating_count;
		  
		@Column( columnDefinition = "decimal(3,2)")
		private Long average_rating;
		  
		@Column( columnDefinition = "bigint(20)")
		private Long total_sales;
		
	
	 @Column(columnDefinition = "VARCHAR(100) COLLATE utf8mb4_unicode_520_ci")
	 String sku ;
		
	 @Column(columnDefinition = "VARCHAR(100) COLLATE utf8mb4_unicode_520_ci")
	 String stock_status ;
		
	 @Column(columnDefinition = "VARCHAR(100) COLLATE utf8mb4_unicode_520_ci")
	 String tax_status ;
		
	 @Column(columnDefinition = "VARCHAR(100) COLLATE utf8mb4_unicode_520_ci")
	 String tax_class ;
	 
	 double stock_quantity ;
	 
}
