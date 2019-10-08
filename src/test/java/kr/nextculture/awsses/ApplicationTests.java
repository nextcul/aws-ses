package kr.nextculture.awsses;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void contextLoads() {
		AwsSesSender awsSesSender = new AwsSesSender();

		AwsSesSenderDto dto = AwsSesSenderDto.builder()
				.from("nextculture@nextculture.kr")
				.to(Lists.newArrayList("nextculture@nextculture.kr"))
				.subject("AWS SES 테스트 메일입니다.")
				.content("<h1>안녕하세요</h1><h3>우아아아아아</h3>")
				.build();

		awsSesSender.send(dto);

		System.out.println("메일이 발송되었습니다.");
	}

}
