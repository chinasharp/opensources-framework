package org.opensourceframework.demo.mybatis;

import org.opensourceframework.commons.boot.AbstractBoot;
import org.opensourceframework.commons.boot.BaseBootApplication;
import org.opensourceframework.commons.boot.OpensourceFrameworkSystem;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * TODO
 *
 * @author yu.ce@foxmail.com
 * @since 1.0.0
 *
 */
@SpringBootApplication
@ComponentScan({"org.opensourceframework"})
public class MybatisDemoBoot extends BaseBootApplication {
	public static void main(String[] args) throws Exception {
		new AbstractBoot(MybatisDemoBoot.class) {
			@Override
			public void execute() {
				OpensourceFrameworkSystem.init();
			}
		}.run(args);
	}
}