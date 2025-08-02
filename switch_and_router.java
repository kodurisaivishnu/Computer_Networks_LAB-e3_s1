//router

ksv>en
Password: 
ksv#conf t
Enter configuration commands, one per line.  End with CNTL/Z.
ksv(config)#en secret 456 
% Ambiguous command: "en secret 456 "
ksv(config)#enable secret 456 
ksv(config)#exit
ksv#
%SYS-5-CONFIG_I: Configured from console by console

ksv#ex









ksv con0 is now available






Press RETURN to get started.













ksv>en
Password: 
ksv#conf t
Enter configuration commands, one per line.  End with CNTL/Z.
ksv(config)#line console 0
ksv(config-line)#password ksv
ksv(config-line)#login
ksv(config-line)#ex
% Ambiguous command: "ex"
ksv(config-line)#exit
ksv(config)#exit
ksv#
%SYS-5-CONFIG_I: Configured from console by console

ksv#exit









ksv con0 is now available






Press RETURN to get started.













User Access Verification

Password: 

ksv>en
Password: 
ksv#show runnning
             ^
% Invalid input detected at '^' marker.
	
ksv#show running
Building configuration...

Current configuration : 640 bytes
!
version 12.4
no service timestamps log datetime msec
no service timestamps debug datetime msec
no service password-encryption
!
hostname ksv
!
!
!
enable secret 5 $1$mERr$DqFv/bNKU3CFm5jwSLasx/
enable password 123
!
!
!
!
!
!
ip cef
no ipv6 cef
!
!
!
!
!
!
!
!
!
!
!
!
spanning-tree mode pvst
!
!
!
!
!
!
interface FastEthernet0/0
 no ip address
 duplex auto
 speed auto
 shutdown
!
interface FastEthernet0/1
 no ip address
 duplex auto
 speed auto
 shutdown
!
interface Vlan1
 no ip address
 shutdown
!
ip classless
!
ip flow-export version 9
!
!
!
!
!
!
!
!
line con 0
 password ksv
 login
!
line aux 0
!
line vty 0 4
 login
!
!
!
end


ksv#
ksv#
ksv#
ksv#
ksv#
ksv#
ksv#
ksv#








ksv con0 is now available






Press RETURN to get started.





//switch



KSV>en
Password: 
KSV#conf t
Enter configuration commands, one per line.  End with CNTL/Z.
KSV(config)#line console 0
KSV(config-line)#password ksv
KSV(config-line)#login
KSV(config-line)#exit
KSV(config)#exit
KSV#
%SYS-5-CONFIG_I: Configured from console by console

KSV#exit









KSV con0 is now available






Press RETURN to get started.













User Access Verification

Password: 

KSV>en
Password: 
KSV#show running
Building configuration...

Current configuration : 1167 bytes
!
version 15.0
no service timestamps log datetime msec
no service timestamps debug datetime msec
no service password-encryption
!
hostname KSV
!
enable secret 5 $1$mERr$DqFv/bNKU3CFm5jwSLasx/
enable password 123
!
!
!
!
!
!
spanning-tree mode pvst
spanning-tree extend system-id
!
interface FastEthernet0/1
!
interface FastEthernet0/2
!
interface FastEthernet0/3
!
interface FastEthernet0/4
!
interface FastEthernet0/5
!
interface FastEthernet0/6
!
interface FastEthernet0/7
!
interface FastEthernet0/8
!
interface FastEthernet0/9
!
interface FastEthernet0/10
!
interface FastEthernet0/11
!
interface FastEthernet0/12
!
interface FastEthernet0/13
!
interface FastEthernet0/14
!
interface FastEthernet0/15
!
interface FastEthernet0/16
!
interface FastEthernet0/17
!
interface FastEthernet0/18
!
interface FastEthernet0/19
!
interface FastEthernet0/20
!
interface FastEthernet0/21
!
interface FastEthernet0/22
!
interface FastEthernet0/23
!
interface FastEthernet0/24
!
interface GigabitEthernet0/1
!
interface GigabitEthernet0/2
!
interface Vlan1
 no ip address
 shutdown
!
!
!
!
line con 0
 password ksv
 login
!
line vty 0 4
 login
line vty 5 15
 login
!
!
!
!
end


KSV#
KSV#
KSV#
KSV#
KSV#
KSV#
KSV#
KSV#
KSV#
KSV#
KSV#
KSV#
KSV#
KSV#
KSV#
KSV#
KSV#
KSV#








KSV con0 is now available






Press RETURN to get started.

















