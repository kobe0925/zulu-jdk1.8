package com.sun.corba.se.PortableActivationIDL.LocatorPackage;

/**
* com/sun/corba/se/PortableActivationIDL/LocatorPackage/ServerLocationPerTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tester/jenkins/workspace/zulu8-build-macos-aarch64/zulu-src/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Friday, October 8, 2021 11:50:00 PM PDT
*/

public final class ServerLocationPerTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerType value = null;

  public ServerLocationPerTypeHolder ()
  {
  }

  public ServerLocationPerTypeHolder (com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerTypeHelper.type ();
  }

}
