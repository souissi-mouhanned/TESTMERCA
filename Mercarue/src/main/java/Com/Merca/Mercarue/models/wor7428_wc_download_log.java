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
public class wor7428_wc_download_log {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column( columnDefinition = "bigint(20)")
	private Long download_log_id;
	
	 @Column( columnDefinition = "bigint(20)")
		private Long permission_id;
	 
	 @Column( columnDefinition = "bigint(20)")
		private Long user_id;
	 
	 @Column(columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_520_ci")
	 String user_ip_address ;
	 
	 LocalDateTime timestamp ;
}
