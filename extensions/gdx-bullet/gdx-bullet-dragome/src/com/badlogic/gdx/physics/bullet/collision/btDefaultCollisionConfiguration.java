/*-------------------------------------------------------
 * This file was automatically generated by XpeCodeGen
 *
 * Dont make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.collision;

/** @author xpenatan */
public class btDefaultCollisionConfiguration extends btCollisionConfiguration {

    public btDefaultCollisionConfiguration() {
        resetObj(createNative(), true);
    }

    private static long createNative() {
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var conf=new Bullet.btDefaultCollisionConfiguration();",null);
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(conf);",null);
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj=Bullet.wrapPointer(this.$$$cPointer,Bullet.btDefaultCollisionConfiguration);",this);
	}

    @Override
    protected void delete() {
		long addr = cPointer;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var conf=Bullet.wrapPointer(addr,Bullet.btDefaultCollisionConfiguration);Bullet.destroy(conf);",this);
    }
}