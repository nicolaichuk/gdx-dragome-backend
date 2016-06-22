/*-------------------------------------------------------
 * This file was automatically generated by XpeCodeGen
 *
 * Dont make changes to this file
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
import com.badlogic.gdx.physics.bullet.linearmath.btQuaternion;
import com.badlogic.gdx.physics.bullet.linearmath.btTransform;
import com.badlogic.gdx.physics.bullet.linearmath.btVector3;

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
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var con=Bullet.wrapPointer(constructionInfoAddr,Bullet.btRigidBodyConstructionInfo);var cobj=new Bullet.btRigidBody(con);",null);
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(cobj);",null);
    }

    private static long createNative(float mass, long motionStateAddr, long collisionShapeAddr, float x, float y, float z) {
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var motion=Bullet.wrapPointer(motionStateAddr,Bullet.btMotionState);var shape=Bullet.wrapPointer(collisionShapeAddr,Bullet.btCollisionShape);var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);var cobj=new Bullet.btRigidBody(mass,motion,shape,vec);",null);
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(cobj);",null);
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj=Bullet.wrapPointer(this.$$$cPointer,Bullet.btRigidBody);",this);
	}

    @Override
    protected void delete() {
        super.delete();
        if (motionState != null)
            motionState.dispose();
        motionState = null;
    }

    public void setContactSolverType(int value) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj.set_m_contactSolverType(value);",this);
    }

    public int getContactSolverType() {
		checkPointer();
		return com.dragome.commons.javascript.ScriptHelper.evalInt("this.$$$jsObj.get_m_contactSolverType();",this);
    }

    public void setFrictionSolverType(int value) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj.set_m_frictionSolverType(value);",this);
    }

    public int getFrictionSolverType() {
		checkPointer();
		return com.dragome.commons.javascript.ScriptHelper.evalInt("this.$$$jsObj.get_m_frictionSolverType();",this);
    }

    public void proceedToTransform(Matrix4 newTrans) {
		checkPointer();
		float [] value = newTrans.val;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var tran=Bullet.MyTemp.prototype.btTran();tran.setFromOpenGLMatrix(value);this.$$$jsObj.proceedToTransform(tran);",this);
    }

    public void predictIntegratedTransform(float step, Matrix4 predictedTransform) {
		checkPointer();
		float [] value = predictedTransform.val;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var tran=Bullet.MyTemp.prototype.btTran();tran.setFromOpenGLMatrix(value);this.$$$jsObj.predictIntegratedTransform(step,tran);",this);
    }

    public void saveKinematicState(float step) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj.saveKinematicState(step);",this);
    }

    public void applyGravity() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj.applyGravity();",this);
    }

    public void setGravity(Vector3 acceleration) {
		checkPointer();
		float x=acceleration.x,y=acceleration.y,z=acceleration.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);this.$$$jsObj.setGravity(vec);",this);
    }

    public void getGravity(Vector3 out) {
		checkPointer();
		float x=0,y=0,z=0;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=this.$$$jsObj.getGravity();x=vec.x();y=vec.y();z=vec.z();",this);
		out.set(x,y,z);
    }

    public void setDamping(float lin_damping, float ang_damping) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj.setDamping(lin_damping,ang_damping);",this);
    }

    public float getLinearDamping() {
		checkPointer();
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("this.$$$jsObj.getLinearDamping();",this);
    }

    public float getAngularDamping() {
		checkPointer();
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("this.$$$jsObj.getAngularDamping();",this);
    }

    public float getLinearSleepingThreshold() {
		checkPointer();
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("this.$$$jsObj.getLinearSleepingThreshold();",this);
    }

    public float getAngularSleepingThreshold() {
		checkPointer();
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("this.$$$jsObj.getAngularSleepingThreshold();",this);
    }

    public void applyDamping(float timeStep) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj.applyDamping(timeStep);",this);
    }

    public void setMassProps(float mass, Vector3 inertia) {
		checkPointer();
		float x=inertia.x,y=inertia.y,z=inertia.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);this.$$$jsObj.setMassProps(mass,vec);",this);
    }

    public void getLinearFactor(Vector3 out) {
		checkPointer();
		float x=0,y=0,z=0;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=this.$$$jsObj.getLinearFactor();x=vec.x();y=vec.y();z=vec.z();",this);
		out.set(x,y,z);
    }

    public void setLinearFactor(Vector3 linearFactor) {
		checkPointer();
		float x=linearFactor.x,y=linearFactor.y,z=linearFactor.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);this.$$$jsObj.setLinearFactor(vec);",this);
    }

    public float getInvMass() {
		checkPointer();
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("this.$$$jsObj.getInvMass();",this);
    }

    public void getInvInertiaTensorWorld(Matrix3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var mat=this.$$$jsObj.getInvInertiaTensorWorld();value[0]=mat.getColumn(0).x();value[1]=mat.getColumn(0).y();value[2]=mat.getColumn(0).z();value[3]=mat.getColumn(1).x();value[4]=mat.getColumn(1).y();value[5]=mat.getColumn(1).z();value[6]=mat.getColumn(2).x();value[7]=mat.getColumn(2).y();value[8]=mat.getColumn(2).z();",this);
    }

    public void integrateVelocities(float step) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj.integrateVelocities(step);",this);
    }

    public void setCenterOfMassTransform(Matrix4 xform) {
		checkPointer();
		float [] value = xform.val;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var tran=Bullet.MyTemp.prototype.btTran();tran.setFromOpenGLMatrix(value);this.$$$jsObj.setCenterOfMassTransform(tran);",this);
    }

    public void applyCentralForce(Vector3 force) {
		checkPointer();
		float x=force.x,y=force.y,z=force.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);this.$$$jsObj.applyCentralForce(vec);",this);
    }

    public void getTotalForce(Vector3 out) {
		checkPointer();
		float x=0,y=0,z=0;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=this.$$$jsObj.getTotalForce();x=vec.x();y=vec.y();z=vec.z();",this);
		out.set(x,y,z);
    }

    public void getTotalTorque(Vector3 out) {
		checkPointer();
		float x=0,y=0,z=0;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=this.$$$jsObj.getTotalTorque();x=vec.x();y=vec.y();z=vec.z();",this);
		out.set(x,y,z);
    }

    public void getInvInertiaDiagLocal(Vector3 out) {
		checkPointer();
		float x=0,y=0,z=0;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=this.$$$jsObj.getInvInertiaDiagLocal();x=vec.x();y=vec.y();z=vec.z();",this);
		out.set(x,y,z);
    }

    public void setInvInertiaDiagLocal(Vector3 diagInvInertia) {
		checkPointer();
		float x=diagInvInertia.x,y=diagInvInertia.y,z=diagInvInertia.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);this.$$$jsObj.setInvInertiaDiagLocal(vec);",this);
    }

    public void setSleepingThresholds(float linear, float angular) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj.setSleepingThresholds(linear,angular);",this);
    }

    public void applyTorque(Vector3 torque) {
		checkPointer();
		float x=torque.x,y=torque.y,z=torque.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);this.$$$jsObj.applyTorque(vec);",this);
    }

    public void applyForce(Vector3 force, Vector3 rel_pos) {
		checkPointer();
		float x1=force.x,y1=force.y,z1=force.z;
		float x2=rel_pos.x,y2=rel_pos.y,z2=rel_pos.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec1=Bullet.MyTemp.prototype.btVec3_1(x1,y1,z1);var vec2=Bullet.MyTemp.prototype.btVec3_2(x2,y2,z2);this.$$$jsObj.applyForce(vec1,vec2);",this);
    }

    public void applyCentralImpulse(Vector3 impulse) {
		checkPointer();
		float x=impulse.x,y=impulse.y,z=impulse.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);this.$$$jsObj.applyCentralImpulse(vec);",this);
    }

    public void applyTorqueImpulse(Vector3 torque) {
		checkPointer();
		float x=torque.x,y=torque.y,z=torque.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);this.$$$jsObj.applyTorqueImpulse(vec);",this);
    }

    public void applyImpulse(Vector3 impulse, Vector3 rel_pos) {
		checkPointer();
		float x1=impulse.x,y1=impulse.y,z1=impulse.z;
		float x2=rel_pos.x,y2=rel_pos.y,z2=rel_pos.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec1=Bullet.MyTemp.prototype.btVec3_1(x1,y1,z1);var vec2=Bullet.MyTemp.prototype.btVec3_2(x2,y2,z2);this.$$$jsObj.applyImpulse(vec1,vec2);",this);
    }

    public void clearForces() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj.clearForces();",this);
    }

    public void updateInertiaTensor() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj.updateInertiaTensor();",this);
    }

    public void getCenterOfMassPosition(Vector3 out) {
		checkPointer();
		float x=0,y=0,z=0;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=this.$$$jsObj.getCenterOfMassPosition();x=vec.x();y=vec.y();z=vec.z();",this);
		out.set(x,y,z);
    }

    public void getOrientation(Quaternion out) {
		checkPointer();
		float x=0,y=0,z=0,w=0;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var quat=this.$$$jsObj.getOrientation();x=quat.x();y=quat.y();z=quat.z();w=quat.w();",this);
		out.set(x,y,z,w);
    }

    public void getCenterOfMassTransform(Matrix4 out) {
		checkPointer();
		Object tran = null;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("tran=this.$$$jsObj.getCenterOfMassTransform();",this);
		btTransform.getOpenGLMatrix(tran, out.val);
    }

    public void getLinearVelocity(Vector3 out) {
		checkPointer();
		float x=0,y=0,z=0;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=this.$$$jsObj.getLinearVelocity();x=vec.x();y=vec.y();z=vec.z();",this);
		out.set(x,y,z);
    }

    public void getAngularVelocity(Vector3 out) {
		checkPointer();
		float x=0,y=0,z=0;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=this.$$$jsObj.getAngularVelocity();x=vec.x();y=vec.y();z=vec.z();",this);
		out.set(x,y,z);
    }

    public void setLinearVelocity(Vector3 lin_vel) {
		checkPointer();
		float x=lin_vel.x,y=lin_vel.y,z=lin_vel.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);this.$$$jsObj.setLinearVelocity(vec);",this);
    }

    public void setAngularVelocity(Vector3 ang_vel) {
		checkPointer();
		float x=ang_vel.x,y=ang_vel.y,z=ang_vel.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);this.$$$jsObj.setAngularVelocity(vec);",this);
    }

    public void getVelocityInLocalPoint(Vector3 rel_pos, Vector3 out) {
		checkPointer();
		float x=rel_pos.x,y=rel_pos.y,z=rel_pos.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);vec=this.$$$jsObj.getVelocityInLocalPoint(vec);x=vec.x();y=vec.y();z=vec.z();",this);
		out.set(x,y,z);
    }

    public void translate(Vector3 v) {
		checkPointer();
		float x=v.x,y=v.y,z=v.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);this.$$$jsObj.translate(vec);",this);
    }

    public void getAabb(Vector3 aabbMin, Vector3 aabbMax) {
		checkPointer();
		float x=0,y=0,z=0;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec1=Bullet.MyTemp.prototype.btVec3_1(0,0,0);var vec2=Bullet.MyTemp.prototype.btVec3_2(0,0,0);this.$$$jsObj.getAabb(vec1,vec2);x=vec1.x();y=vec1.y();z=vec1.z();",this);
		aabbMin.set(x,y,z);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("x=vec2.x();y=vec2.y();z=vec2.z();",this);
		aabbMax.set(x,y,z);
    }

    public float computeImpulseDenominator(Vector3 pos, Vector3 normal) {
		checkPointer();
		float x1=pos.x,y1=pos.y,z1=pos.z;
		float x2=normal.x,y2=normal.y,z2=normal.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec1=Bullet.MyTemp.prototype.btVec3_1(x1,y1,z1);var vec2=Bullet.MyTemp.prototype.btVec3_2(x2,y2,z2);",this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("this.$$$jsObj.computeImpulseDenominator(vec1,vec2);",this);
    }

    public float computeAngularImpulseDenominator(Vector3 axis) {
		checkPointer();
		float x=axis.x,y=axis.y,z=axis.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);",this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("this.$$$jsObj.computeAngularImpulseDenominator(vec);",this);
    }

    public void updateDeactivation(float timeStep) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj.updateDeactivation(timeStep);",this);
    }

    public boolean wantsSleeping() {
		checkPointer();
		return com.dragome.commons.javascript.ScriptHelper.evalBoolean("this.$$$jsObj.wantsSleeping();",this);
    }

    public btMotionState getMotionState() {
        return motionState;
    }

    public void setMotionState(btMotionState motionState) {
		checkPointer();
		this.motionState = motionState;
		Object jsObj = null;
		if(motionState != null)
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj=motionState.$$$jsObj;this.$$$jsObj.setMotionState(jsObj);",this);
    }

    public void setAngularFactor(Vector3 angFac) {
		checkPointer();
		float x=angFac.x,y=angFac.y,z=angFac.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);this.$$$jsObj.setAngularFactor(vec);",this);
    }

    public void getAngularFactor(Vector3 out) {
		checkPointer();
		float x=0,y=0,z=0;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=this.$$$jsObj.getAngularFactor();x=vec.x();y=vec.y();z=vec.z();",this);
		out.set(x,y,z);
    }

    public boolean isInWorld() {
		checkPointer();
		return com.dragome.commons.javascript.ScriptHelper.evalBoolean("this.$$$jsObj.isInWorld();",this);
    }

    /**
	 * btTypedConstraint object is not cached. If btTypedConstraint is manually created dont let parameter object get garbage collected.
	 */
    public void addConstraintRef(btTypedConstraint c) {
		checkPointer();
		c.checkPointer();
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj.addConstraintRef(c.$$$jsObj);",this);
    }

    public void removeConstraintRef(btTypedConstraint c) {
		checkPointer();
		c.checkPointer();
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj.removeConstraintRef(c.$$$jsObj);",this);
    }

    /**
	 * Dont keep a reference of this object. Will get replaced by other index calls.
	 */
    public btTypedConstraint getConstraintRef(int index) {
		checkPointer();
		Object jsConstraint = null;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsConstraint=this.$$$jsObj.getConstraintRef(index);",this);
		if(jsConstraint == null)
		return null;
		long addr = 0;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("addr=Bullet.getPointer(jsConstraint);",this);
		typedConstraint.resetObj(addr, false);
		return typedConstraint;
    }

    public int getNumConstraintRefs() {
		checkPointer();
		return com.dragome.commons.javascript.ScriptHelper.evalInt("this.$$$jsObj.getNumConstraintRefs();",this);
    }

    public void setFlags(int flags) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj.setFlags(flags);",this);
    }

    public int getFlags() {
		checkPointer();
		return com.dragome.commons.javascript.ScriptHelper.evalInt("this.$$$jsObj.getFlags();",this);
    }

    public void computeGyroscopicImpulseImplicit_World(float dt, Vector3 out) {
		checkPointer();
		float x=0,y=0,z=0;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=this.$$$jsObj.computeGyroscopicImpulseImplicit_World(dt);x=vec.x();y=vec.y();z=vec.z();",this);
		out.set(x,y,z);
    }

    public void computeGyroscopicImpulseImplicit_Body(float step, Vector3 out) {
		checkPointer();
		float x=0,y=0,z=0;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=this.$$$jsObj.computeGyroscopicImpulseImplicit_Body(step);x=vec.x();y=vec.y();z=vec.z();",this);
		out.set(x,y,z);
    }

    public void computeGyroscopicForceExplicit(float maxGyroscopicForce, Vector3 out) {
		checkPointer();
		float x=0,y=0,z=0;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=this.$$$jsObj.computeGyroscopicForceExplicit(maxGyroscopicForce);x=vec.x();y=vec.y();z=vec.z();",this);
		out.set(x,y,z);
    }

    public void getLocalInertia(Vector3 out) {
		checkPointer();
		float x=0,y=0,z=0;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=this.$$$jsObj.getLocalInertia();x=vec.x();y=vec.y();z=vec.z();",this);
		out.set(x,y,z);
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

        private static native long createNative(float mass, long motionStateAddr, long collisionShapeAddr, float x, float y, float z);
        //TODO need to finish other methods
    }
}
