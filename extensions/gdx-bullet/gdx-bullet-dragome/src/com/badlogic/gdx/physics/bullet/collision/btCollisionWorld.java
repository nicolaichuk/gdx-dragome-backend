/*-------------------------------------------------------
 * This file was generated by XpeCodeGen
 * Version 1.0.0
 *
 * Do not make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.collision;

import java.util.Iterator;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw;
import com.badlogic.gdx.physics.bullet.linearmath.btVector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.LongMap;

/** @author xpenatan */
public class btCollisionWorld extends BulletBase {

    /** Use only for iterating. Don't use it for adding or removing bodies. */
    public final LongMap<btCollisionObject> bodies = new LongMap<btCollisionObject>(100);

    protected btBroadphaseInterface broadphasePairCache;

    protected btDispatcher dispatcher;

    private btIDebugDraw debugDrawer;

    private btDispatcherInfo dispInfo = new btDispatcherInfo(0, false);

    public btCollisionWorld() {
    }

    public btCollisionWorld(btDispatcher dispatcher, btBroadphaseInterface broadphasePairCache, btCollisionConfiguration collisionConfiguration) {
        this.broadphasePairCache = broadphasePairCache;
        this.dispatcher = dispatcher;
        resetObj(createNative(dispatcher.cPointer, broadphasePairCache.cPointer, collisionConfiguration.cPointer), true);
    }

    private static long createNative(long dispatcherAddr, long broadphaseAddr, long collConfAddr) {
		com.dragome.commons.javascript.ScriptHelper.put("collConfAddr",collConfAddr,null);
		com.dragome.commons.javascript.ScriptHelper.put("broadphaseAddr",broadphaseAddr,null);
		com.dragome.commons.javascript.ScriptHelper.put("dispatcherAddr",dispatcherAddr,null);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var dispatch=Bullet.wrapPointer(dispatcherAddr,Bullet.btDispatcher);var cache=Bullet.wrapPointer(broadphaseAddr,Bullet.broadphasePairCache);var colConfig=Bullet.wrapPointer(collConfAddr,Bullet.btCollisionConfiguration);var cobj=new Bullet.btCollisionWorld(dispatch,cache,colConfig);",null);
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(cobj);",null);
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.put("addr",this.cPointer,this);
		this.jsObj = com.dragome.commons.javascript.ScriptHelper.eval("Bullet.wrapPointer(addr,Bullet.btCollisionWorld);",this);
	}

    @Override
    protected void delete() {
		bodies.clear();
		super.delete();
    }

    protected final void addBody(btCollisionObject body) {
        bodies.put(body.cPointer, body);
        body.world = this;
    }

    protected final void removeBody(btCollisionObject body) {
        body.world = null;
        bodies.remove(body.cPointer);
    }

    /** Copy collision objects to array*/
    public void getBodies(Array<btCollisionObject> bodies) {
        checkPointer();
        bodies.clear();
        bodies.ensureCapacity(this.bodies.size);
        for (Iterator<btCollisionObject> iter = this.bodies.values(); iter.hasNext(); ) {
            bodies.add(iter.next());
        }
    }

    public void setBroadphase(btBroadphaseInterface pairCache) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("pObj",broadphasePairCache.jsObj,this);
		broadphasePairCache = pairCache;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setBroadphase(pObj);",this);
    }

    public btBroadphaseInterface getBroadphase() {
        checkPointer();
        return broadphasePairCache;
    }

    public btOverlappingPairCache getPairCache() {
        checkPointer();
        return broadphasePairCache.getOverlappingPairCache();
    }

    public btDispatcher getDispatcher() {
        checkPointer();
        return dispatcher;
    }

    public void updateSingleAabb(btCollisionObject obj) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("oObj",obj.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.updateSingleAabb(oObj);",this);
    }

    public void updateAabbs() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.updateAabbs();",this);
    }

    public void computeOverlappingPairs() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.computeOverlappingPairs();",this);
    }

    public void setDebugDrawer(btIDebugDraw debugDrawer) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("dObj",debugDrawer.jsObj,this);
		this.debugDrawer = debugDrawer;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setDebugDrawer(dObj);",this);
    }

    public btIDebugDraw getDebugDrawer() {
        checkPointer();
        return this.debugDrawer;
    }

    public void debugDrawWorld() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.debugDrawWorld();",this);
    }

    public void debugDrawObject(Matrix4 worldTransform, btCollisionShape shape, Vector3 color) {
        checkPointer();
    //TODO need impl
    }

    public int getNumCollisionObjects() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalInt("jsObj.getNumCollisionObjects();",this);
    }

    public void rayTest(Vector3 rayFromWorld, Vector3 rayToWorld, RayResultCallback resultCallback) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("vec1",com.badlogic.gdx.physics.bullet.linearmath.btVector3.btVector3_1.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("vec2",com.badlogic.gdx.physics.bullet.linearmath.btVector3.btVector3_2.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x1",rayFromWorld.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y1",rayFromWorld.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z1",rayFromWorld.z,this);
		com.dragome.commons.javascript.ScriptHelper.put("x2",rayToWorld.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y2",rayToWorld.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z2",rayToWorld.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("vec1.setValue(x1,y1,z1);vec2.setValue(x2,y2,z2);",this);
		com.dragome.commons.javascript.ScriptHelper.put("rObj",resultCallback.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.rayTest(vec1,vec2,rObj);",this);
    }

    public void addCollisionObject(btCollisionObject collisionObject) {
		checkPointer();
		addBody(collisionObject);
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("cObj",collisionObject.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.addCollisionObject(cObj);",this);
    }

    public void addCollisionObject(btCollisionObject collisionObject, short collisionFilterGroup) {
		checkPointer();
		addBody(collisionObject);
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("cObj",collisionObject.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.addCollisionObject(cObj,collisionFilterGroup);",this);
    }

    public void addCollisionObject(btCollisionObject collisionObject, short collisionFilterGroup, short collisionFilterMask) {
		checkPointer();
		addBody(collisionObject);
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("cObj",collisionObject.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.addCollisionObject(cObj,collisionFilterGroup,collisionFilterMask);",this);
    }

    public void removeCollisionObject(btCollisionObject collisionObject) {
		checkPointer();
		removeBody(collisionObject);
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("cObj",collisionObject.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.removeCollisionObject(cObj);",this);
    }

    public void performDiscreteCollisionDetection() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.performDiscreteCollisionDetection();",this);
    }

    public btDispatcherInfo getDispatchInfo() {
        checkPointer();
        if (dispInfo.cPointer == 0) {
            dispInfo.resetObj(getDispatchInfo(cPointer), false);
        }
        return dispInfo;
    }

    private long getDispatchInfo(long addr) {
		com.dragome.commons.javascript.ScriptHelper.put("addr",addr,this);
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(jsObj.getDispatchInfo());",this);
    }

    public boolean getForceUpdateAllAabbs() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalBoolean("jsObj.getForceUpdateAllAabbs();",this);
    }

    public void setForceUpdateAllAabbs(boolean value) {
		com.dragome.commons.javascript.ScriptHelper.put("value",value,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setForceUpdateAllAabbs(value);",this);
    }
}
