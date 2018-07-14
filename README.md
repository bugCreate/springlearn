# springlearn
cloud-gateway 网关服务，负责路由请求
config-server 配置中心，负责管理配置，使用git管理，支持版本号读取配置
eureka server 服务治理中心，服务发现，服务治理，请求的负载均衡。
eureka client 服务提供者，将服务注册到服务治理中心，提供基本服务。
ribbon 使用ribbon和eureka client 向服务中心请求服务
