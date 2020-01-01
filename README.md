# Eureka-Server
> https://github.com/Netflix/eureka/wiki/Eureka-at-a-glance

Eureka is a REST (Representational State Transfer) based service that is primarily used in the AWS cloud for locating services for the purpose of load balancing and failover of middle-tier servers. We call this service, the Eureka Server. Eureka also comes with a Java-based client component,the Eureka Client, which makes interactions with the service much easier. The client also has a built-in load balancer that does basic round-robin load balancing. At Netflix, a much more sophisticated load balancer wraps Eureka to provide weighted load balancing based on several factors like traffic, resource usage, error conditions etc to provide superior resiliency.


#### 1 Eureka- Server link
https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-eureka-server.html

#### 2 Eureka- Client link 
https://cloud.spring.io/spring-cloud-netflix/multi/multi__service_discovery_eureka_clients.html

#### containerize docker
````
<!-- docker build plugin to create image name -->
            <plugin>
                <groupId>com.spotify</groupId>
                <artifactId>docker-maven-plugin</artifactId>
                <version>1.2.1</version>
                <configuration>
                    <imageName>eureka-server</imageName>
                    <baseImage>java:8</baseImage>
                    <entryPoint>["java", "-jar", "/${project.build.finalName}.jar"]</entryPoint>
                    <!-- copy the service's jar file from target into the root directory 
                        of the image -->
                    <resources>
                        <resource>
                            <targetPath>/</targetPath>
                            <directory>${project.build.directory}</directory>
                            <include>${project.build.finalName}.jar</include>
                        </resource>
                    </resources>
                </configuration>
            </plugin>
````  