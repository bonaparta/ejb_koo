

Base On Eclipse

1. File => New => Enterprise Application Project => next => next => generate application.xml...
2. File => New => EJB Project => EAR membership => Add project to an EAR (Check)
3. Next => Next => EJB Client JAR => Create an EJB Client... (Check)
4. Finish

5. File => New => Session Bean => Create bussiness interface => Remote + Local (Check)
6. ...finish code

7. Run Enterprise Application Client

8. File => New => Application Client Project => EAR memership => Add project to EAR (Check)
9. Next => Next => Generate application-client.xml...
10. Finish
11. Project (right click) => Properties => Java Build Path => Projects => Add... => Session BeanClient*
12. Project... => Libraries => Add External JARs... => glassfish/lib/appserv-rt.jar
