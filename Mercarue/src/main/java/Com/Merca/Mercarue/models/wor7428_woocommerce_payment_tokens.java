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
public class wor7428_woocommerce_payment_tokens {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	@Column( columnDefinition = "bigint(20)")
	private Long token_id;
	  
	@Column( columnDefinition = "bigint(20)")
	private Long user_id;
	  
	@Column( columnDefinition = "tinyint(1)")
		private Long is_default;
	
	 @Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String gateway_id ;
		
	 @Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci")
	 String token ;
	 
	 @Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String type ;
}
