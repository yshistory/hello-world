#javaServlet
这个是maven工程中的Tomcat的部署。
# spring-boot热部署
  
  	<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			 <optional>true</optional>
              <scope>true</scope> 
		</dependency>
	</dependencies>
	<build>
		<plugins>
			<plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <!--fork :  如果没有该项配置，肯定devtools不会起作用，即应用不会restart -->
                    <fork>true</fork>
                </configuration>
            </plugin>
		</plugins>
	</build>
  
  注意：此配置仅在STS中适用，如果不成功可能是将STS的自动编译取消了，在STS顶部的project中打开->build automatically，即可。
  
