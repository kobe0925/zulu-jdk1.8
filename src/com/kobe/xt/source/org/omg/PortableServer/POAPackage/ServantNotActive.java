package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/ServantNotActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tester/jenkins/workspace/zulu8-build-macos-aarch64/zulu-src/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Friday, October 8, 2021 11:50:01 PM PDT
*/

public final class ServantNotActive extends org.omg.CORBA.UserException
{

  public ServantNotActive ()
  {
    super(ServantNotActiveHelper.id());
  } // ctor


  public ServantNotActive (String $reason)
  {
    super(ServantNotActiveHelper.id() + "  " + $reason);
  } // ctor

} // class ServantNotActive
