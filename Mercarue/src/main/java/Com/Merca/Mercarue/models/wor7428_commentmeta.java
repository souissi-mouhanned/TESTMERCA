package Com.Merca.Mercarue.models;
import javax.persistence.*;

import lombok.Data;

@Data

@Entity
@Table 
public class wor7428_commentmeta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long meta_id;
	Long comment_id;
	String meta_key;
    @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci")

	String meta_value;
}
