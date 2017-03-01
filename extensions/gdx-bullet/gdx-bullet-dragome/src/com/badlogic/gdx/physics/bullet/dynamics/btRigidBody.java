/*-------------------------------------------------------
 * This file was generated by XpeCodeGen
 * Version 1.0.0
 *
 * Do not make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.collision.btCollisionObject;
import com.badlogic.gdx.physics.bullet.collision.btCollisionShape;
import com.badlogic.gdx.physics.bullet.linearmath.btMotionState;
import com.badlogic.gdx.physics.bullet.linearmath.btTransform;;

/** @author xpenatan */
public class btRigidBody extends btCollisionObject {

    protected btMotionState motionState;

    btTypedConstraint typedConstraint = new btTypedConstraint(0, false);

    @Override
    protected void create() // block super class from creating obj;
    {
    }

    public btRigidBody(btRigidBodyConstructionInfo constructionInfo) {
        this.shape = constructionInfo.collisionShape;
        this.motionState = constructionInfo.motionState;
        resetObj(createNative(constructionInfo.cPointer), true);
    }

    public btRigidBody(float mass, btMotionState motionState, btCollisionShape collisionShape, Vector3 localInertia) {
        this.shape = collisionShape;
        this.motionState = motionState;
        resetObj(createNative(mass, motionState != null ? motionState.cPointer : 0, collisionShape != null ? collisionShape.cPointer : 0, localInertia.x, localInertia.y, localInertia.z), true);
    }

    public btRigidBody(float mass, btMotionState motionState, btCollisionShape collisionShape) {
        this.shape = collisionShape;
        this.motionState = motionState;
        resetObj(createNative(mass, motionState != null ? motionState.cPointer : 0, collisionShape != null ? collisionShape.cPointer : 0, 0, 0, 0), true);
    }

    private static long createNative(long constructionInfoAddr) {
		com.dragome.commons.javascript.ScriptHelper.put("constructionInfoAddr",constructionInfoAddr,null);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var con=Bullet.wrapPointer(constructionInfoAddr,Bullet.btRigidBodyConstructionInfo);var cobj=new Bullet.btRigidBody(con);",null);
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(cobj);",null);
    }

    private static long createNative(float mass, long motionStateAddr, long collisionShapeAddr, float x, float y, float z) {
		com.dragome.commons.javascript.ScriptHelper.put("z",z,null);
		com.dragome.commons.javascript.ScriptHelper.put("y",y,null);
		com.dragome.commons.javascript.ScriptHelper.put("x",x,null);
		com.dragome.commons.javascript.ScriptHelper.put("collisionShapeAddr",collisionShapeAddr,null);
		com.dragome.commons.javascript.ScriptHelper.put("motionStateAddr",motionStateAddr,null);
		com.dragome.commons.javascript.ScriptHelper.put("mass",mass,null);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var motion=Bullet.wrapPointer(motionStateAddr,Bullet.btMotionState);var shape=Bullet.wrapPointer(collisionShapeAddr,Bullet.btCollisionShape);var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);var cobj=new Bullet.btRigidBody(mass,motion,shape,vec);",null);
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(cobj);",null);
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.put("addr",this.cPointer,this);
		this.jsObj = com.dragome.commons.javascript.ScriptHelper.eval("Bullet.wrapPointer(addr,Bullet.btRigidBody);",this);
	}

    @Override
    protected void delete() {
        super.delete();
        if (motionState != null)
            motionState.dispose();
        motionState = null;
    }

    public void setContactSolverType(int value) {
		com.dragome.commons.javascript.ScriptHelper.put("value",value,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.set_m_contactSolverType(value);",this);
    }

    public int getContactSolverType() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalInt("jsObj.get_m_contactSolverType();",this);
    }

    public void setFrictionSolverType(int value) {
		com.dragome.commons.javascript.ScriptHelper.put("value",value,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.set_m_frictionSolverType(value);",this);
    }

    public int getFrictionSolverType() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalInt("jsObj.get_m_frictionSolverType();",this);
    }

    public void proceedToTransform(Matrix4 newTrans) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("value",newTrans.val,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var tran=Bullet.MyTemp.prototype.btTran();tran.setFromOpenGLMatrix(value);",this);
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.proceedToTransform(tran);",this);
    }

    public void predictIntegratedTransform(float step, Matrix4 predictedTransform) {
		com.dragome.commons.javascript.ScriptHelper.put("step",step,this);
		checkPointer();
		float [] value = predictedTransform.val;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var tran=Bullet.MyTemp.prototype.btTran();tran.setFromOpenGLMatrix(value);",this);
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.predictIntegratedTransform(step,tran);",this);
    }

    public void saveKinematicState(float step) {
		com.dragome.commons.javascript.ScriptHelper.put("step",step,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.saveKinematicState(step);",this);
    }

    public void applyGravity() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.applyGravity();",this);
    }

    public void setGravity(Vector3 acceleration) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("x",acceleration.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",acceleration.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",acceleration.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);",this);
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setGravity(vec);",this);
    }

    public void getGravity(Vector3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=jsObj.getGravity();",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.z();",this);
    }

    public void setDamping(float lin_damping, float ang_damping) {
		com.dragome.commons.javascript.ScriptHelper.put("ang_damping",ang_damping,this);
		com.dragome.commons.javascript.ScriptHelper.put("lin_damping",lin_damping,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setDamping(lin_damping,ang_damping);",this);
    }

    public float getLinearDamping() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.getLinearDamping();",this);
    }

    public float getAngularDamping() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.getAngularDamping();",this);
    }

    public float getLinearSleepingThreshold() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.getLinearSleepingThreshold();",this);
    }

    public float getAngularSleepingThreshold() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.getAngularSleepingThreshold();",this);
    }

    public void applyDamping(float timeStep) {
		com.dragome.commons.javascript.ScriptHelper.put("timeStep",timeStep,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.applyDamping(timeStep);",this);
    }

    public void setMassProps(float mass, Vector3 inertia) {
		com.dragome.commons.javascript.ScriptHelper.put("mass",mass,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("x",inertia.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",inertia.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",inertia.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);",this);
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setMassProps(mass,vec);",this);
    }

    public void getLinearFactor(Vector3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=jsObj.getLinearFactor();",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.z();",this);
    }

    public void setLinearFactor(Vector3 linearFactor) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("x",linearFactor.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",linearFactor.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",linearFactor.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);",this);
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setLinearFactor(vec);",this);
    }

    public float getInvMass() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.getInvMass();",this);
    }

    public void getInvInertiaTensorWorld(Matrix3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var mat=jsObj.getInvInertiaTensorWorld();",this);
		out.val[0] = com.dragome.commons.javascript.ScriptHelper.evalFloat("mat.getColumn(0).x();",this);
		out.val[1] = com.dragome.commons.javascript.ScriptHelper.evalFloat("mat.getColumn(0).y();",this);
		out.val[2] = com.dragome.commons.javascript.ScriptHelper.evalFloat("mat.getColumn(0).z();",this);
		out.val[3] = com.dragome.commons.javascript.ScriptHelper.evalFloat("mat.getColumn(1).x();",this);
		out.val[4] = com.dragome.commons.javascript.ScriptHelper.evalFloat("mat.getColumn(1).y();",this);
		out.val[5] = com.dragome.commons.javascript.ScriptHelper.evalFloat("mat.getColumn(1).z();",this);
		out.val[6] = com.dragome.commons.javascript.ScriptHelper.evalFloat("mat.getColumn(2).x();",this);
		out.val[7] = com.dragome.commons.javascript.ScriptHelper.evalFloat("mat.getColumn(2).y();",this);
		out.val[8] = com.dragome.commons.javascript.ScriptHelper.evalFloat("mat.getColumn(2).z();",this);
    }

    public void integrateVelocities(float step) {
		com.dragome.commons.javascript.ScriptHelper.put("step",step,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.integrateVelocities(step);",this);
    }

    public void setCenterOfMassTransform(Matrix4 xform) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("value",xform.val,this);
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var tran=Bullet.MyTemp.prototype.btTran();tran.setFromOpenGLMatrix(value);jsObj.setCenterOfMassTransform(tran);",this);
    }

    public void applyCentralForce(Vector3 force) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",force.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",force.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",force.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);jsObj.applyCentralForce(vec);",this);
    }

    public void getTotalForce(Vector3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=jsObj.getTotalForce();",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.z();",this);
    }

    public void getTotalTorque(Vector3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=jsObj.getTotalTorque();",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.z();",this);
    }

    public void getInvInertiaDiagLocal(Vector3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=jsObj.getInvInertiaDiagLocal();",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.z();",this);
    }

    public void setInvInertiaDiagLocal(Vector3 diagInvInertia) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",diagInvInertia.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",diagInvInertia.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",diagInvInertia.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);jsObj.setInvInertiaDiagLocal(vec);",this);
    }

    public void setSleepingThresholds(float linear, float angular) {
		com.dragome.commons.javascript.ScriptHelper.put("angular",angular,this);
		com.dragome.commons.javascript.ScriptHelper.put("linear",linear,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setSleepingThresholds(linear,angular);",this);
    }

    public void applyTorque(Vector3 torque) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",torque.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",torque.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",torque.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);jsObj.applyTorque(vec);",this);
    }

    public void applyForce(Vector3 force, Vector3 rel_pos) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x1",force.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y1",force.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z1",force.z,this);
		com.dragome.commons.javascript.ScriptHelper.put("x2",rel_pos.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y2",rel_pos.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z2",rel_pos.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec1=Bullet.MyTemp.prototype.btVec3_1(x1,y1,z1);var vec2=Bullet.MyTemp.prototype.btVec3_2(x2,y2,z2);jsObj.applyForce(vec1,vec2);",this);
    }

    public void applyCentralImpulse(Vector3 impulse) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",impulse.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",impulse.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",impulse.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);jsObj.applyCentralImpulse(vec);",this);
    }

    public void applyTorqueImpulse(Vector3 torque) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",torque.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",torque.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",torque.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);jsObj.applyTorqueImpulse(vec);",this);
    }

    public void applyImpulse(Vector3 impulse, Vector3 rel_pos) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x1",impulse.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y1",impulse.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z1",impulse.z,this);
		com.dragome.commons.javascript.ScriptHelper.put("x2",rel_pos.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y2",rel_pos.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z2",rel_pos.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec1=Bullet.MyTemp.prototype.btVec3_1(x1,y1,z1);var vec2=Bullet.MyTemp.prototype.btVec3_2(x2,y2,z2);jsObj.applyImpulse(vec1,vec2);",this);
    }

    public void clearForces() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.clearForces();",this);
    }

    public void updateInertiaTensor() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.updateInertiaTensor();",this);
    }

    public void getCenterOfMassPosition(Vector3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=jsObj.getCenterOfMassPosition();",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.z();",this);
    }

    public void getOrientation(Quaternion out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var quat=jsObj.getOrientation();",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("quat.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("quat.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("quat.z();",this);
		out.w = com.dragome.commons.javascript.ScriptHelper.evalFloat("quat.w();",this);
    }

    public void getCenterOfMassTransform(Matrix4 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		Object tran = com.dragome.commons.javascript.ScriptHelper.eval("jsObj.getCenterOfMassTransform();",this);
		btTransform.getOpenGLMatrix(tran, out.val);
    }

    public void getLinearVelocity(Vector3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=jsObj.getLinearVelocity();",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.z();",this);
    }

    public void getAngularVelocity(Vector3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=jsObj.getAngularVelocity();",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.z();",this);
    }

    public void setLinearVelocity(Vector3 lin_vel) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",lin_vel.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",lin_vel.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",lin_vel.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);jsObj.setLinearVelocity(vec);",this);
    }

    public void setAngularVelocity(Vector3 ang_vel) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",ang_vel.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",ang_vel.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",ang_vel.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);jsObj.setAngularVelocity(vec);",this);
    }

    public void getVelocityInLocalPoint(Vector3 rel_pos, Vector3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",rel_pos.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",rel_pos.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",rel_pos.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);vec=jsObj.getVelocityInLocalPoint(vec);",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.z();",this);
    }

    public void translate(Vector3 v) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",v.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",v.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",v.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);jsObj.translate(vec);",this);
    }

    public void getAabb(Vector3 aabbMin, Vector3 aabbMax) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec1=Bullet.MyTemp.prototype.btVec3_1(0,0,0);var vec2=Bullet.MyTemp.prototype.btVec3_2(0,0,0);jsObj.getAabb(vec1,vec2);",this);
		float x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec1.x();",this);
		float y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec1.y();",this);
		float z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec1.z();",this);
		aabbMin.set(x,y,z);
		x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec2.x();",this);
		y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec2.y();",this);
		z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec2.z();",this);
		aabbMax.set(x,y,z);
    }

    public float computeImpulseDenominator(Vector3 pos, Vector3 normal) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x1",pos.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y1",pos.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z1",pos.z,this);
		com.dragome.commons.javascript.ScriptHelper.put("x2",normal.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y2",normal.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z2",normal.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec1=Bullet.MyTemp.prototype.btVec3_1(x1,y1,z1);var vec2=Bullet.MyTemp.prototype.btVec3_2(x2,y2,z2);",this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.computeImpulseDenominator(vec1,vec2);",this);
    }

    public float computeAngularImpulseDenominator(Vector3 axis) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",axis.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",axis.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",axis.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);",this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.computeAngularImpulseDenominator(vec);",this);
    }

    public void updateDeactivation(float timeStep) {
		com.dragome.commons.javascript.ScriptHelper.put("timeStep",timeStep,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.updateDeactivation(timeStep);",this);
    }

    public boolean wantsSleeping() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalBoolean("jsObj.wantsSleeping();",this);
    }

    public btMotionState getMotionState() {
        return motionState;
    }

    public void setMotionState(btMotionState motionState) {
		checkPointer();
		this.motionState = motionState;
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var motionObj=null;",this);
		if(motionState != null) {
			com.dragome.commons.javascript.ScriptHelper.put("motionObj",motionState.jsObj,this);
		}
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setMotionState(motionObj);",this);
    }

    public void setAngularFactor(Vector3 angFac) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",angFac.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",angFac.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",angFac.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);jsObj.setAngularFactor(vec);",this);
    }

    public void getAngularFactor(Vector3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=jsObj.getAngularFactor();",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.z();",this);
    }

    public boolean isInWorld() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalBoolean("jsObj.isInWorld();",this);
    }

    /**
	 * btTypedConstraint object is not cached. If btTypedConstraint is manually created dont let parameter object get garbage collected.
	 */
    public void addConstraintRef(btTypedConstraint c) {
		checkPointer();
		c.checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("cjsObj",c.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.addConstraintRef(cjsObj);",this);
    }

    public void removeConstraintRef(btTypedConstraint c) {
		checkPointer();
		c.checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("cjsObj",c.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.removeConstraintRef(cjsObj);",this);
    }

    /**
	 * Dont keep a reference of this object. Will get replaced by other index calls.
	 */
    public btTypedConstraint getConstraintRef(int index) {
		com.dragome.commons.javascript.ScriptHelper.put("index",index,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		Object jsConstraint = com.dragome.commons.javascript.ScriptHelper.eval("jsObj.getConstraintRef(index);",this);
		if(jsConstraint == null) {
			return null;
		}
		long addr = com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(jsConstraint);",this);
		typedConstraint.resetObj(addr, false);
		return typedConstraint;
    }

    public int getNumConstraintRefs() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalInt("jsObj.getNumConstraintRefs();",this);
    }

    public void setFlags(int flags) {
		com.dragome.commons.javascript.ScriptHelper.put("flags",flags,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setFlags(flags);",this);
    }

    public int getFlags() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalInt("jsObj.getFlags();",this);
    }

    public void computeGyroscopicImpulseImplicit_World(float dt, Vector3 out) {
		com.dragome.commons.javascript.ScriptHelper.put("dt",dt,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=jsObj.computeGyroscopicImpulseImplicit_World(dt);",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.z();",this);
    }

    public void computeGyroscopicImpulseImplicit_Body(float step, Vector3 out) {
		com.dragome.commons.javascript.ScriptHelper.put("step",step,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=jsObj.computeGyroscopicImpulseImplicit_Body(step);",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.z();",this);
    }

    public void computeGyroscopicForceExplicit(float maxGyroscopicForce, Vector3 out) {
		com.dragome.commons.javascript.ScriptHelper.put("maxGyroscopicForce",maxGyroscopicForce,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=jsObj.computeGyroscopicForceExplicit(maxGyroscopicForce);",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.z();",this);
    }

    public void getLocalInertia(Vector3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=jsObj.getLocalInertia();",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.z();",this);
    }

    public static class btRigidBodyConstructionInfo extends BulletBase {

        btMotionState motionState;

        btCollisionShape collisionShape;

        public btRigidBodyConstructionInfo(float mass, btMotionState motionState, btCollisionShape collisionShape, Vector3 localInertia) {
            this.motionState = motionState;
            this.collisionShape = collisionShape;
            resetObj(createNative(mass, motionState != null ? motionState.cPointer : 0, collisionShape != null ? collisionShape.cPointer : 0, localInertia.x, localInertia.y, localInertia.z), true);
        }

        public btRigidBodyConstructionInfo(float mass, btMotionState motionState, btCollisionShape collisionShape) {
            this.motionState = motionState;
            this.collisionShape = collisionShape;
            resetObj(createNative(mass, motionState != null ? motionState.cPointer : 0, collisionShape != null ? collisionShape.cPointer : 0, 0, 0, 0), true);
        }

        private static long createNative(float mass, long motionStateAddr, long collisionShapeAddr, float x, float y, float z) {
			com.dragome.commons.javascript.ScriptHelper.put("z",z,null);
			com.dragome.commons.javascript.ScriptHelper.put("y",y,null);
			com.dragome.commons.javascript.ScriptHelper.put("x",x,null);
			com.dragome.commons.javascript.ScriptHelper.put("collisionShapeAddr",collisionShapeAddr,null);
			com.dragome.commons.javascript.ScriptHelper.put("motionStateAddr",motionStateAddr,null);
			com.dragome.commons.javascript.ScriptHelper.put("mass",mass,null);
			com.dragome.commons.javascript.ScriptHelper.evalNoResult("var motion=Bullet.wrapPointer(motionStateAddr,Bullet.btMotionState);var shape=Bullet.wrapPointer(collisionShapeAddr,Bullet.btCollisionShape);var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);var cobj=new Bullet.btRigidBodyConstructionInfo(mass,motion,shape,vec);",null);
			return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(cobj);",null);
        }

		protected void cacheObj() {
			com.dragome.commons.javascript.ScriptHelper.put("addr",this.cPointer,this);
			this.jsObj = com.dragome.commons.javascript.ScriptHelper.eval("Bullet.wrapPointer(addr,Bullet.btRigidBodyConstructionInfo);",this);
		}
        //TODO need to finish other methods
    }
}
