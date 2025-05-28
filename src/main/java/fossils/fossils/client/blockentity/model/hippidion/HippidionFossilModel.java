package fossils.fossils.client.blockentity.model.hippidion;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HippidionFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public HippidionFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -25.1766F, 12.3022F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 50).addBox(0.0F, -0.2528F, 0.0063F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.12F, -0.0425F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 82).addBox(0.0F, -3.0358F, -1.9101F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.332F, -1.3594F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(33, 63).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.6104F, 2.6946F, 1.2871F, 0.0038F, -0.1483F, -0.67F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(27, 37).mirror().addBox(-1.8F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.5346F, -0.0839F, -0.0859F, 0.06F, 0.6083F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 56).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9332F, 3.7822F, 3.4736F, -1.6434F, -0.168F, -1.3954F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(59, 55).mirror().addBox(-0.3F, -1.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0907F, 3.6746F, 2.2444F, -0.2187F, -0.0966F, -0.3214F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(45, 83).mirror().addBox(0.0F, -0.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9264F, 1.6547F, -0.5702F, -0.6839F, 0.0945F, -0.3582F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(63, 31).mirror().addBox(-0.6F, -0.6F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3639F, 1.2198F, -0.8934F, -0.6815F, -0.0547F, -0.2372F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 78).mirror().addBox(-0.1465F, -1.4356F, 0.0818F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1026F, -0.0079F, -3.4597F, -0.9242F, 0.0558F, 1.5606F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(7, 78).mirror().addBox(-0.148F, -0.4585F, -0.8888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1026F, -0.0079F, -3.4597F, 0.2118F, 0.0836F, 1.5817F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 67).mirror().addBox(-0.5653F, -1.07F, 0.1116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.4089F, -0.9799F, -4.6029F, -1.4842F, 0.0684F, 0.869F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(78, 8).mirror().addBox(-0.148F, -0.2411F, -0.0908F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1026F, -0.0079F, -3.4597F, -0.2595F, 0.0836F, 1.5817F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(48, 76).mirror().addBox(-0.5F, 0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0561F, -2.8809F, -1.6667F, -0.0879F, 0.0684F, 0.5723F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(15, 76).mirror().addBox(-0.4992F, -3.5483F, -0.9105F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1265F, 0.1891F, -2.7922F, -0.4021F, 0.0684F, 0.5723F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(38, 58).mirror().addBox(-0.5653F, -0.27F, -0.8884F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3754F, -0.8239F, -2.5499F, -1.1002F, 0.0684F, 0.869F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(31, 58).mirror().addBox(-0.5653F, -0.2117F, -0.8371F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3754F, -0.8239F, -2.5499F, -0.0879F, 0.0684F, 0.869F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(59, 15).mirror().addBox(-0.3F, -0.1F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6858F, 1.6774F, 1.5611F, -0.8295F, -0.0966F, -0.3214F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(73, 70).mirror().addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2553F, 3.6518F, 4.267F, -0.7856F, -0.1966F, -0.7868F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(19, 63).mirror().addBox(-0.0279F, -0.9596F, -0.0796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3842F, 2.6371F, -0.1589F, 0.0397F, -0.1406F, -0.3173F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(12, 63).mirror().addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3639F, 1.2198F, -0.8934F, -0.705F, -0.243F, -0.0795F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(17, 56).mirror().addBox(-0.8F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6233F, -3.2027F, -0.0749F, -0.2093F, -0.0028F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(59, 55).addBox(-0.7F, -1.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0907F, 3.6746F, 2.2444F, -0.2187F, 0.0966F, 0.3214F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(59, 15).addBox(-0.7F, -0.1F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.6858F, 1.6774F, 1.5611F, -0.8295F, 0.0966F, 0.3214F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(10, 56).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9332F, 3.7822F, 3.4736F, -1.6434F, 0.168F, 1.3954F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(73, 70).addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2553F, 3.6518F, 4.267F, -0.7856F, 0.1966F, 0.7868F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(33, 63).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.6104F, 2.6946F, 1.2871F, 0.0038F, 0.1483F, 0.67F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(19, 63).addBox(-0.9721F, -0.9596F, -0.0796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3842F, 2.6371F, -0.1589F, 0.0397F, 0.1406F, 0.3173F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(63, 31).addBox(-0.4F, -0.6F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3639F, 1.2198F, -0.8934F, -0.6815F, 0.0547F, 0.2372F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(45, 83).addBox(-1.0F, -0.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9264F, 1.6547F, -0.5702F, -0.6839F, -0.0945F, 0.3582F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(12, 63).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3639F, 1.2198F, -0.8934F, -0.705F, 0.243F, 0.0795F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(15, 76).addBox(-0.5008F, -3.5483F, -0.9105F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1265F, 0.1891F, -2.7922F, -0.4021F, -0.0684F, -0.5723F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(48, 76).addBox(-0.5F, 0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0561F, -2.8809F, -1.6667F, -0.0879F, -0.0684F, -0.5723F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(7, 78).addBox(-0.852F, -0.4585F, -0.8888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.1026F, -0.0079F, -3.4597F, 0.2118F, -0.0836F, -1.5817F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(24, 78).addBox(-0.8535F, -1.4356F, 0.0818F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.1026F, -0.0079F, -3.4597F, -0.9242F, -0.0558F, -1.5606F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(78, 8).addBox(-0.852F, -0.2411F, -0.0908F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1026F, -0.0079F, -3.4597F, -0.2595F, -0.0836F, -1.5817F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(16, 86).addBox(-0.648F, -2.2156F, -0.4066F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.648F, -0.7524F, -4.918F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(19, 86).addBox(0.4911F, -0.1695F, -0.5987F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.648F, -0.7524F, -4.918F, -2.9877F, -0.216F, 1.8804F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(31, 58).addBox(-0.4347F, -0.2117F, -0.8371F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3754F, -0.8239F, -2.5499F, -0.0879F, -0.0684F, -0.869F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(40, 67).addBox(-0.4347F, -1.07F, 0.1116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4089F, -0.9799F, -4.6029F, -1.4842F, -0.0684F, -0.869F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(38, 58).addBox(-0.4347F, -0.27F, -0.8884F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3754F, -0.8239F, -2.5499F, -1.1002F, -0.0684F, -0.869F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(17, 56).addBox(-0.2F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6233F, -3.2027F, -0.0749F, 0.2093F, 0.0028F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, -0.362F, -3.9591F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.332F, -1.3594F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(27, 37).addBox(-0.2F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 3.5346F, -0.0839F, -0.0859F, -0.06F, -0.6083F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7437F, 1.9051F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(26, 17).addBox(-0.5F, -0.2F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 3.0571F, 1.9857F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(35, 31).addBox(-1.0F, -1.0F, -0.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 31).addBox(-0.5F, 1.0F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4272F, 0.4026F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(21, 71).addBox(-1.0F, 0.3F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2457F, -1.3818F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(26, 63).addBox(-1.0F, -0.7F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4234F, -0.6386F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -4.5F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.6274F, -1.4203F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(73, 82).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.1122F, -3.803F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(50, 4).addBox(-1.0F, -0.5236F, -1.0608F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 6.532F, -2.0041F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(51, 22).addBox(-1.0F, -0.0495F, -1.1792F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.532F, -2.0041F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(54, 40).addBox(-1.0F, -1.0708F, -1.0512F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.532F, -2.0041F, -1.0297F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.9427F, -1.4527F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(60, 44).addBox(-1.0F, -0.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(73, 13).addBox(-1.0F, -0.1747F, 0.048F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.435F, -0.6494F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(59, 69).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(66, 16).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(46, 23).addBox(-1.9F, -1.0479F, -1.3979F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4F, 2.5813F, 0.8228F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(70, 29).addBox(-0.5F, -0.0739F, 0.0299F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.2293F, -0.7876F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.7997F, -1.3328F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(11, 71).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.96F, 0.7047F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(35, 71).addBox(-0.5F, -1.5F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -0.671F, 0.3175F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(5, 50).addBox(-1.0F, -0.1857F, -1.0115F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(41, 0).addBox(-0.6F, -0.1858F, -2.7932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 5.7835F, -0.7402F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(84, 33).addBox(-0.9385F, -0.5271F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, 0.7842F, -2.9448F, 0.4509F, -0.2758F, 0.5123F));

		PartDefinition cube_r64 = leftLeg4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(80, 53).addBox(-1.0434F, -0.2573F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1F, 0.7842F, -2.9448F, 0.5233F, 0.0175F, -0.0302F));

		PartDefinition cube_r65 = leftLeg4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(47, 80).addBox(0.0434F, -0.2573F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1F, 0.7842F, -2.9448F, 0.5233F, -0.0175F, 0.0302F));

		PartDefinition cube_r66 = leftLeg4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(82, 39).addBox(-0.0615F, -0.5271F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, 0.7842F, -2.9448F, 0.4509F, 0.2758F, -0.5123F));

		PartDefinition cube_r67 = leftLeg4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(50, 83).addBox(-1.0F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2858F, -2.7932F, 0.096F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 3.0571F, 1.9857F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(11, 36).addBox(-1.0F, -1.0F, -0.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 36).addBox(-0.5F, 1.0F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4272F, 0.4026F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(28, 71).addBox(-1.0F, 0.3F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2457F, -1.3818F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(40, 63).addBox(-1.0F, -0.7F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4234F, -0.6386F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(18, 48).addBox(-0.5F, -4.5F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.6274F, -1.4203F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(17, 83).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.1122F, -3.803F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(32, 50).addBox(-1.0F, -0.5236F, -1.0608F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 6.532F, -2.0041F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(51, 26).addBox(-1.0F, -0.0495F, -1.1792F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.532F, -2.0041F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(41, 54).addBox(-1.0F, -1.0708F, -1.0512F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.532F, -2.0041F, -1.0297F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.9427F, -1.4527F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(5, 61).addBox(-1.0F, -0.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(73, 54).addBox(-1.0F, -0.1747F, 0.048F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.435F, -0.6494F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(66, 69).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(66, 56).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(45, 46).addBox(0.9F, -1.0479F, -1.3979F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4F, 2.5813F, 0.8228F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(70, 39).addBox(-0.5F, -0.0739F, 0.0299F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.2293F, -0.7876F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.7997F, -1.3328F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(16, 71).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.96F, 0.7047F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(62, 72).addBox(-0.5F, -1.5F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -0.671F, 0.3175F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(50, 46).addBox(0.0F, -0.1857F, -1.0115F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(41, 11).addBox(-0.4F, -0.1858F, -2.7932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 5.7835F, -0.7402F, 2.3736F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(83, 62).addBox(-0.0615F, -0.5271F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 0.7842F, -2.9448F, 0.4509F, 0.2758F, -0.5123F));

		PartDefinition cube_r86 = rightLeg4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(17, 80).addBox(0.0434F, -0.2573F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.1F, 0.7842F, -2.9448F, 0.5233F, -0.0175F, 0.0302F));

		PartDefinition cube_r87 = rightLeg4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(5, 58).addBox(-1.0434F, -0.2573F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.1F, 0.7842F, -2.9448F, 0.5233F, 0.0175F, -0.0302F));

		PartDefinition cube_r88 = rightLeg4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(82, 27).addBox(-0.9385F, -0.5271F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 0.7842F, -2.9448F, 0.4509F, -0.2758F, 0.5123F));

		PartDefinition cube_r89 = rightLeg4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(40, 83).addBox(0.0F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.2858F, -2.7932F, 0.096F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3528F, -5.3386F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(44, 78).addBox(0.0F, -2.3577F, -1.018F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3684F, -0.8135F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(50, 18).mirror().addBox(-0.9F, 0.3F, -0.1F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1636F, 5.0691F, -4.2874F, -0.3781F, 0.3369F, -2.3909F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(77, 35).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.027F, -3.3109F, 0.1113F, 0.2235F, -0.735F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.027F, -3.3109F, 0.0488F, 0.2446F, -1.0033F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(12, 61).mirror().addBox(-4.0551F, -2.1982F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.027F, -3.3109F, -0.072F, 0.2389F, -1.4979F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(19, 86).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2404F, 0.8667F, -2.9452F, 0.0829F, -1.8741F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(42, 36).mirror().addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4675F, 0.2452F, -1.2215F, -2.8807F, 0.0491F, -1.8803F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(60, 77).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.027F, -5.3109F, 0.1113F, 0.2235F, -0.735F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.027F, -5.3109F, 0.0488F, 0.2446F, -1.0033F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(53, 77).mirror().addBox(-5.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.027F, -5.3109F, -0.072F, 0.2389F, -1.4979F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(42, 36).addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4675F, 0.2452F, -1.2215F, -2.8807F, -0.0491F, 1.8803F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(50, 18).addBox(-0.1F, 0.3F, -0.1F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1636F, 5.0691F, -4.2874F, -0.3781F, -0.3369F, 2.3909F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(12, 61).addBox(3.0551F, -2.1982F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.027F, -3.3109F, -0.072F, -0.2389F, 1.4979F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 78).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.027F, -3.3109F, 0.0488F, -0.2446F, 1.0033F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(77, 35).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.027F, -3.3109F, 0.1113F, -0.2235F, 0.735F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(60, 77).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.027F, -5.3109F, 0.1113F, -0.2235F, 0.735F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(78, 0).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.027F, -5.3109F, 0.0488F, -0.2446F, 1.0033F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(53, 77).addBox(3.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.027F, -5.3109F, -0.072F, -0.2389F, 1.4979F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(32, 82).addBox(-0.5753F, -2.2213F, -0.9822F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.3643F, -2.8688F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(70, 83).addBox(-0.4485F, -2.2943F, -0.4457F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4485F, -0.2429F, -5.3378F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5623F, -4.8135F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0437F, -5.8061F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(23, 50).mirror().addBox(-1.0F, 0.0F, -0.4F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2701F, 8.1672F, -3.2065F, -0.3985F, 0.5089F, -2.1158F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(51, 30).mirror().addBox(-1.0F, 0.0F, -0.4F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0632F, 6.7168F, -1.1549F, -0.4862F, 0.3625F, -2.1449F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-1.0F, 0.0F, -0.4F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5787F, 5.5527F, 0.8115F, -0.5834F, 0.3538F, -2.1893F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(73, 76).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.2394F, 0.2922F, -0.6182F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(77, 33).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.1544F, 0.3437F, -0.8886F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(59, 59).mirror().addBox(-6.0551F, -2.1982F, -0.4625F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, -0.0292F, 0.3745F, -1.4009F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(78, 2).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.1968F, 0.2593F, -0.5776F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(78, 65).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.122F, 0.3011F, -0.8466F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(54, 38).mirror().addBox(-7.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, -0.0357F, 0.3223F, -1.3509F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(80, 4).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, 0.1518F, 0.2305F, -0.5885F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(37, 19).mirror().addBox(-8.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, -0.0476F, 0.2712F, -1.3544F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(80, 6).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, 0.0861F, 0.2617F, -0.8566F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(73, 76).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.2394F, -0.2922F, 0.6182F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(77, 33).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.1544F, -0.3437F, 0.8886F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(50, 0).addBox(0.0F, 0.0F, -0.4F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5787F, 5.5527F, 0.8115F, -0.5834F, -0.3538F, 2.1893F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(59, 59).addBox(3.0551F, -2.1982F, -0.4625F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, -0.0292F, -0.3745F, 1.4009F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(78, 2).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.1968F, -0.2593F, 0.5776F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(78, 65).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.122F, -0.3011F, 0.8466F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(51, 30).addBox(0.0F, 0.0F, -0.4F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0632F, 6.7168F, -1.1549F, -0.4862F, -0.3625F, 2.1449F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(54, 38).addBox(3.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, -0.0357F, -0.3223F, 1.3509F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(80, 4).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, 0.1518F, -0.2305F, 0.5885F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(23, 50).addBox(0.0F, 0.0F, -0.4F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2701F, 8.1672F, -3.2065F, -0.3985F, -0.5089F, 2.1158F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(37, 19).addBox(3.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, -0.0476F, -0.2712F, 1.3544F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(80, 6).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, 0.0861F, -0.2617F, 0.8566F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(15, 9).addBox(-0.5F, -0.3F, -6.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2135F, 0.1404F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(8, 82).addBox(0.0F, -2.0938F, -0.146F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1832F, -1.8045F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(85, 51).addBox(0.0F, -2.4938F, -0.046F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1865F, -3.8596F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(78, 85).addBox(0.0F, -2.9698F, 0.0459F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5865F, -5.9596F, -0.1309F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9529F, -5.7577F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(21, 74).addBox(0.0F, -3.5074F, -0.0125F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1449F, -2.0436F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 68).addBox(0.0F, -4.3163F, -0.0473F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -3.9F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(8, 69).addBox(0.0F, -4.3803F, -0.0801F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -5.6F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(67, 72).addBox(0.0F, -4.1415F, -0.0742F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6F, -7.4F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(17, 7).mirror().addBox(-0.1F, 0.1F, -0.3F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3616F, 9.4913F, -3.011F, -0.319F, -0.8801F, -2.6543F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(30, 9).mirror().addBox(0.0F, 0.1F, -0.3F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3616F, 9.4913F, -3.011F, -0.1212F, -0.6537F, -2.9227F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(34, 6).mirror().addBox(-0.6F, 0.1F, -0.4F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4232F, 9.49F, -3.0898F, -0.1459F, -0.316F, -2.8952F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(77, 37).mirror().addBox(-0.1F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3842F, 8.6276F, -7.5974F, 0.3016F, 0.0269F, -2.8906F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(24, 58).mirror().addBox(-0.8939F, -0.1006F, -2.1891F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9835F, -0.4699F, -3.8525F, 0.3047F, -0.4292F, 0.4279F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(83, 8).mirror().addBox(-0.5252F, 1.8054F, -3.0785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9192F, 1.9265F, -7.0392F, 0.2174F, -0.4292F, 0.4279F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(37, 25).mirror().addBox(-0.5F, -1.3F, -1.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9835F, 0.0301F, -5.2525F, 0.9155F, -0.4292F, 0.4279F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(17, 58).mirror().addBox(-0.5252F, -0.4153F, 1.4054F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.9192F, 1.9265F, -7.0392F, 1.5613F, -0.4292F, 0.4279F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(13, 24).mirror().addBox(-1.0063F, -0.0031F, -1.9672F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9192F, 1.9265F, -7.0392F, 0.9887F, -0.0329F, 0.2596F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(18, 37).mirror().addBox(-0.5F, -0.8F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5551F, 1.0108F, -6.9935F, 1.3519F, -0.4292F, 0.4279F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.5252F, -0.8523F, -3.5328F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9192F, 1.9265F, -7.0392F, 1.2123F, -0.4292F, 0.4279F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(60, 29).mirror().addBox(-0.2F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4753F, 9.1675F, -6.0555F, -0.0209F, -0.2046F, -2.9384F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(26, 23).mirror().addBox(-9.1956F, -2.6256F, -0.4869F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5449F, -1.5436F, -0.0594F, 0.22F, -1.3049F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(45, 74).mirror().addBox(-4.068F, -0.8367F, -0.4869F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5449F, -1.5436F, 0.0507F, 0.2222F, -0.8127F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-2.2141F, -0.273F, -0.4869F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5449F, -1.5436F, 0.1071F, 0.2014F, -0.5457F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(37, 17).mirror().addBox(-8.112F, -2.6218F, -0.7258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3F, -3.0F, -0.0737F, 0.1695F, -1.3426F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(73, 74).mirror().addBox(-3.9922F, -0.8719F, -0.7258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3F, -3.0F, 0.0138F, 0.1842F, -0.8551F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(75, 39).mirror().addBox(-2.15F, -0.3266F, -0.7258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3F, -3.0F, 0.0614F, 0.1743F, -0.5892F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(41, 23).mirror().addBox(-3.8855F, -2.5824F, -0.4703F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0F, -8.7F, -0.0161F, 0.2715F, -1.6747F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(41, 76).mirror().addBox(-3.773F, -0.9416F, -0.4703F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0F, -8.7F, 0.1138F, 0.2476F, -1.1784F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(75, 31).mirror().addBox(-1.9563F, -0.4506F, -0.4703F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0F, -8.7F, 0.1745F, 0.2097F, -0.9124F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(59, 19).mirror().addBox(-6.0259F, -2.6396F, -0.6072F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, -6.7F, -0.0568F, 0.1849F, -1.4958F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(34, 76).mirror().addBox(-3.9241F, -0.9275F, -0.6072F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, -6.7F, 0.036F, 0.1899F, -1.0072F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(75, 29).mirror().addBox(-2.0985F, -0.3979F, -0.6072F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, -6.7F, 0.0844F, 0.1741F, -0.7414F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(75, 41).mirror().addBox(-2.2168F, -0.3059F, -0.406F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, -5.1F, 0.0642F, 0.1706F, -0.6759F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(8, 76).mirror().addBox(-4.0621F, -0.8692F, -0.406F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, -5.1F, 0.0174F, 0.1813F, -0.9416F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(37, 21).mirror().addBox(-0.8F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4958F, 9.1965F, -4.0271F, -0.14F, -0.1432F, -2.9207F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(45, 8).mirror().addBox(-7.1753F, -2.6516F, -0.406F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, -5.1F, -0.0691F, 0.1686F, -1.429F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(30, 11).mirror().addBox(-1.2632F, -0.0465F, -0.019F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9192F, 5.4265F, -8.4392F, 0.9505F, -0.4292F, 0.4279F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(13, 30).mirror().addBox(-1.2632F, -0.7605F, 2.4621F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9192F, 5.4265F, -8.4392F, 0.6974F, -0.4292F, 0.4279F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(13, 24).addBox(0.0063F, -0.0031F, -1.9672F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9192F, 1.9265F, -7.0392F, 0.9887F, 0.0329F, -0.2596F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(24, 58).addBox(-0.1061F, -0.1006F, -2.1891F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9835F, -0.4699F, -3.8525F, 0.3047F, 0.4292F, -0.4279F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(37, 25).addBox(-0.5F, -1.3F, -1.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9835F, 0.0301F, -5.2525F, 0.9155F, 0.4292F, -0.4279F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(17, 58).addBox(-0.4748F, -0.4153F, 1.4054F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.9192F, 1.9265F, -7.0392F, 1.5613F, 0.4292F, -0.4279F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(18, 37).addBox(-0.5F, -0.8F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5551F, 1.0108F, -6.9935F, 1.3519F, 0.4292F, -0.4279F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(83, 8).addBox(-0.4748F, 1.8054F, -3.0785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9192F, 1.9265F, -7.0392F, 0.2174F, 0.4292F, -0.4279F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 42).addBox(-0.4748F, -0.8523F, -3.5328F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9192F, 1.9265F, -7.0392F, 1.2123F, 0.4292F, -0.4279F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(77, 37).addBox(-1.9F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3842F, 8.6276F, -7.5974F, 0.3016F, -0.0269F, 2.8906F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(60, 29).addBox(-2.8F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4753F, 9.1675F, -6.0555F, -0.0209F, 0.2046F, 2.9384F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(26, 23).addBox(3.1956F, -2.6256F, -0.4869F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5449F, -1.5436F, -0.0594F, -0.22F, 1.3049F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(45, 74).addBox(2.068F, -0.8367F, -0.4869F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5449F, -1.5436F, 0.0507F, -0.2222F, 0.8127F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(74, 27).addBox(0.2141F, -0.273F, -0.4869F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5449F, -1.5436F, 0.1071F, -0.2014F, 0.5457F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(37, 17).addBox(3.112F, -2.6218F, -0.7258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, -3.0F, -0.0737F, -0.1695F, 1.3426F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(70, 72).addBox(0.0F, -4.5627F, -0.0033F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4839F, -9.2701F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(73, 74).addBox(1.9922F, -0.8719F, -0.7258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, -3.0F, 0.0138F, -0.1842F, 0.8551F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(75, 39).addBox(0.15F, -0.3266F, -0.7258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, -3.0F, 0.0614F, -0.1743F, 0.5892F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(41, 23).addBox(2.8855F, -2.5824F, -0.4703F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -8.7F, -0.0161F, -0.2715F, 1.6747F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(41, 76).addBox(1.773F, -0.9416F, -0.4703F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -8.7F, 0.1138F, -0.2476F, 1.1784F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(75, 31).addBox(-0.0437F, -0.4506F, -0.4703F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -8.7F, 0.1745F, -0.2097F, 0.9124F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(59, 19).addBox(3.0259F, -2.6396F, -0.6072F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -6.7F, -0.0568F, -0.1849F, 1.4958F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(34, 76).addBox(1.9241F, -0.9275F, -0.6072F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -6.7F, 0.036F, -0.1899F, 1.0072F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(75, 29).addBox(0.0985F, -0.3979F, -0.6072F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -6.7F, 0.0844F, -0.1741F, 0.7414F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(75, 41).addBox(0.2168F, -0.3059F, -0.406F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -5.1F, 0.0642F, -0.1706F, 0.6759F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(8, 76).addBox(2.0621F, -0.8692F, -0.406F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -5.1F, 0.0174F, -0.1813F, 0.9416F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(17, 7).addBox(-6.9F, 0.1F, -0.3F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3616F, 9.4913F, -3.011F, -0.319F, 0.8801F, 2.6543F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(30, 9).addBox(-6.0F, 0.1F, -0.3F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3616F, 9.4913F, -3.011F, -0.1212F, 0.6537F, 2.9227F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(34, 6).addBox(-4.4F, 0.1F, -0.4F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4232F, 9.49F, -3.0898F, -0.1459F, 0.316F, 2.8952F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(37, 21).addBox(-3.2F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4958F, 9.1965F, -4.0271F, -0.14F, 0.1432F, 2.9207F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(45, 8).addBox(3.1753F, -2.6516F, -0.406F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -5.1F, -0.0691F, -0.1686F, 1.429F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(30, 11).addBox(0.2632F, -0.0465F, -0.019F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9192F, 5.4265F, -8.4392F, 0.9505F, 0.4292F, -0.4279F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(36, 40).addBox(-0.5F, -0.3642F, -3.0066F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0551F, -0.0436F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(13, 30).addBox(0.2632F, -0.7605F, 2.4621F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9192F, 5.4265F, -8.4392F, 0.6974F, 0.4292F, -0.4279F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(59, 51).addBox(-1.1328F, 1.2612F, -6.9093F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6328F, 10.9332F, -2.337F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 17).addBox(-1.1328F, -1.9365F, -5.2503F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6328F, 10.9332F, -2.337F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1855F, -6.9515F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.6F, -3.0F, 0.4625F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1F, 6.7469F, -8.834F, 0.8772F, 0.1009F, -0.0835F));

		PartDefinition cube_r208 = leftarm.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(63, 40).addBox(-0.0018F, -0.0429F, -0.0104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5102F, 0.7076F, -0.1962F, 1.1606F, 0.0014F, -0.001F));

		PartDefinition cube_r209 = leftarm.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(45, 58).addBox(0.0F, -1.6F, -1.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5119F, -0.1535F, 0.4938F, 0.4799F, 0.0014F, -0.001F));

		PartDefinition cube_r210 = leftarm.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(52, 71).addBox(0.0F, -1.9961F, -0.0634F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 3.4865F, 1.3632F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r211 = leftarm.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(29, 78).addBox(0.0F, -1.9961F, -0.0634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.9432F, 0.091F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r212 = leftarm.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(40, 71).addBox(0.0F, 0.1039F, 0.1366F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 0.8719F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r213 = leftarm.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(60, 21).addBox(0.0F, -1.2F, -2.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 5.9601F, 2.3498F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftarm.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(34, 78).addBox(0.0F, -1.0F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftarm.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(55, 83).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.3575F, 1.9537F, -0.192F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 5.5724F, 2.0947F, -2.0896F, -0.0547F, 0.0758F));

		PartDefinition cube_r216 = leftarm2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(85, 65).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1064F, 0.6583F, -0.8367F, 1.5708F, -1.2566F, -1.5708F));

		PartDefinition cube_r217 = leftarm2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(0, 62).addBox(0.0053F, -0.0363F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 3.5713F, -0.6163F, 1.5708F, -1.3963F, -1.5708F));

		PartDefinition cube_r218 = leftarm2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(73, 57).addBox(-0.2F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6064F, 3.4804F, -0.3964F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition cube_r219 = leftarm2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(74, 23).addBox(-0.018F, -1.9884F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.164F, 0.5563F, 0.696F, 1.5708F, 1.3963F, -1.5708F));

		PartDefinition cube_r220 = leftarm2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(29, 74).addBox(-1.043F, -2.0067F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.164F, -1.2232F, -0.1378F, 1.5708F, 1.3439F, -1.5708F));

		PartDefinition cube_r221 = leftarm2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(3, 74).addBox(0.257F, -2.9067F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.164F, -1.2702F, 2.0549F, 1.5708F, 1.1694F, -1.5708F));

		PartDefinition cube_r222 = leftarm2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(80, 50).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1236F, -1.828F, 0.5576F, 1.5708F, 0.7156F, -1.5708F));

		PartDefinition cube_r223 = leftarm2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(80, 47).addBox(-0.1F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1236F, -1.0515F, 1.1635F, 1.5708F, 0.2443F, -1.5708F));

		PartDefinition cube_r224 = leftarm2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(22, 82).addBox(-1.9973F, 0.0887F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, -2.3856F, 1.1517F, 1.5708F, -0.4363F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, -0.2F, -0.5017F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 7.5907F, 0.6727F, 2.2618F, -0.0914F, 0.0963F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(3, 69).addBox(-0.5F, 0.0545F, -0.3306F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8445F, 0.0263F, 0.6945F, -0.0162F, 0.093F));

		PartDefinition cube_r225 = leftArm4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(83, 56).addBox(-0.5F, -0.763F, -0.593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0384F, 3.3108F, 0.3063F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r226 = leftArm4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(60, 48).addBox(-0.2883F, -0.1779F, -0.521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0384F, 3.3108F, 0.3063F, 2.0782F, 0.5162F, 0.2679F));

		PartDefinition cube_r227 = leftArm4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(65, 83).addBox(0.0579F, 0.1587F, -0.521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0384F, 3.3108F, 0.3063F, 2.0074F, -0.0316F, -0.0148F));

		PartDefinition cube_r228 = leftArm4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(85, 0).addBox(-0.7117F, -0.1779F, -0.521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0384F, 3.3108F, 0.3063F, 2.0782F, -0.5162F, -0.2679F));

		PartDefinition cube_r229 = leftArm4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(82, 30).addBox(-1.0579F, 0.1587F, -0.521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0384F, 3.3108F, 0.3063F, 2.0074F, 0.0316F, 0.0148F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1F, 6.7469F, -8.834F, 0.0087F, -0.0011F, 0.1309F));

		PartDefinition cube_r230 = rightarm.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(66, 61).addBox(-0.9982F, -0.0429F, -0.0104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5102F, 0.7076F, -0.1962F, 1.1606F, -0.0014F, 0.001F));

		PartDefinition cube_r231 = rightarm.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(59, 5).addBox(-1.0F, -1.6F, -1.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5119F, -0.1535F, 0.4938F, 0.4799F, -0.0014F, 0.001F));

		PartDefinition cube_r232 = rightarm.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(57, 72).addBox(-1.0F, -1.9961F, -0.0634F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.4865F, 1.3632F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r233 = rightarm.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(78, 57).addBox(-1.0F, -1.9961F, -0.0634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.9432F, 0.091F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r234 = rightarm.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(72, 34).addBox(-1.0F, 0.1039F, 0.1366F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 0.8719F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r235 = rightarm.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(60, 25).addBox(-1.0F, -1.2F, -2.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 5.9601F, 2.3498F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r236 = rightarm.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(39, 78).addBox(-1.0F, -1.0F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r237 = rightarm.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(83, 59).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.3575F, 1.9537F, -0.192F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 5.5724F, 2.0947F, -1.4362F, 0.0099F, -0.0539F));

		PartDefinition cube_r238 = rightarm2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(73, 85).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1064F, 0.6583F, -0.8367F, 1.5708F, 1.2566F, 1.5708F));

		PartDefinition cube_r239 = rightarm2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(47, 63).addBox(-1.0053F, -0.0363F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6064F, 3.5713F, -0.6163F, 1.5708F, 1.3963F, 1.5708F));

		PartDefinition cube_r240 = rightarm2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(73, 62).addBox(-0.8F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6064F, 3.4804F, -0.3964F, 1.5708F, 1.5184F, 1.5708F));

		PartDefinition cube_r241 = rightarm2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(24, 74).addBox(-0.982F, -1.9884F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.164F, 0.5563F, 0.696F, 1.5708F, -1.3963F, 1.5708F));

		PartDefinition cube_r242 = rightarm2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(74, 44).addBox(0.043F, -2.0067F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.164F, -1.2232F, -0.1378F, 1.5708F, -1.3439F, 1.5708F));

		PartDefinition cube_r243 = rightarm2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(74, 19).addBox(-1.257F, -2.9067F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.164F, -1.2702F, 2.0549F, 1.5708F, -1.1694F, 1.5708F));

		PartDefinition cube_r244 = rightarm2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(80, 74).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1236F, -1.828F, 0.5576F, 1.5708F, -0.7156F, 1.5708F));

		PartDefinition cube_r245 = rightarm2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(80, 67).addBox(-0.9F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1236F, -1.0515F, 1.1635F, 1.5708F, -0.2443F, 1.5708F));

		PartDefinition cube_r246 = rightarm2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(27, 82).addBox(0.9973F, 0.0887F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, -2.3856F, 1.1517F, 1.5708F, 0.4363F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(55, 44).addBox(-0.5F, -0.2F, -0.5017F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 7.5907F, 0.6727F, 0.8273F, 0.002F, -0.0466F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(47, 69).addBox(-0.5F, 0.0545F, -0.3306F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8445F, 0.0263F, 0.042F, -0.0077F, -0.0493F));

		PartDefinition cube_r247 = rightArm4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(60, 83).addBox(-0.5F, -0.763F, -0.593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0384F, 3.3108F, 0.3063F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r248 = rightArm4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(80, 16).addBox(-0.7117F, -0.1779F, -0.521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0384F, 3.3108F, 0.3063F, 2.0782F, -0.5162F, -0.2679F));

		PartDefinition cube_r249 = rightArm4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(83, 70).addBox(-1.0579F, 0.1587F, -0.521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.0384F, 3.3108F, 0.3063F, 2.0074F, 0.0316F, 0.0148F));

		PartDefinition cube_r250 = rightArm4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(85, 11).addBox(-0.2883F, -0.1779F, -0.521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0384F, 3.3108F, 0.3063F, 2.0782F, 0.5162F, 0.2679F));

		PartDefinition cube_r251 = rightArm4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(35, 82).addBox(0.0579F, 0.1587F, -0.521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.0384F, 3.3108F, 0.3063F, 2.0074F, -0.0316F, -0.0148F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, -8.9F, 0.4375F, 0.174F, 0.0138F));

		PartDefinition cube_r252 = neck3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(41, 50).addBox(0.0F, -2.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 45).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.9F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3831F, -2.3411F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r253 = neck2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(47, 5).addBox(0.0F, -1.1681F, 1.9279F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 47).addBox(0.0F, -1.1681F, -0.0721F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 31).addBox(-0.5F, -0.1681F, -0.0721F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9F, -2.1F, -0.4479F, 0.2221F, 0.0061F));

		PartDefinition cube_r254 = neck.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(88, 73).addBox(0.0F, 0.6247F, 0.5291F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 80).addBox(-0.5F, 0.6247F, -0.4709F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.7F, -2.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(73, 78).addBox(-0.5F, -3.7887F, -0.1565F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4157F, -1.3699F, 1.377F, 0.2081F, 0.0654F));

		PartDefinition cube_r255 = neck4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(73, 8).mirror().addBox(0.0F, -2.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0887F, 2.0435F, 0.2546F, 0.4667F, 0.1166F));

		PartDefinition cube_r256 = neck4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(73, 8).addBox(0.0F, -2.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0887F, 2.0435F, 0.2546F, -0.4667F, -0.1166F));

		PartDefinition cube_r257 = neck4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(79, 19).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.7887F, 0.8435F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r258 = neck4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(73, 0).addBox(0.0F, -1.0F, -0.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4132F, 0.8326F, 1.4486F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.5405F, -0.3011F, -1.2762F, -0.1713F, -0.051F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(59, 61).addBox(-0.5F, -0.8982F, -0.2143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.7682F, -2.6863F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(73, 5).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.2396F, -5.5387F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(67, 44).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.9222F, -8.7549F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(45, 36).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.0045F, -7.4442F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(26, 67).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 2.0941F, -7.78F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(32, 54).addBox(-1.1F, -0.2F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1349F, 4.1717F, -9.285F, 0.7877F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(73, 48).addBox(-1.1349F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.1349F, 6.0292F, -9.1313F, 2.4108F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(73, 51).addBox(-1.1349F, -0.3F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(73, 16).addBox(-1.1349F, -0.3F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.1349F, 5.2785F, -9.8359F, 1.8174F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(23, 54).addBox(-1.1F, -0.2F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1349F, 4.087F, -8.768F, 0.84F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -0.7F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.4161F, -6.2067F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(5, 65).addBox(-1.0F, -0.1115F, -1.5021F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.2F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(50, 14).addBox(-1.0F, -0.6F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.6014F, -1.0453F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(45, 41).addBox(-2.5F, -0.0454F, -1.9657F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5F, -1.5473F, -2.3286F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(50, 10).addBox(-2.5F, -0.0454F, -0.0657F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.5732F, -2.232F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(52, 67).addBox(-1.0F, -0.2454F, 0.0343F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.1974F, -4.6887F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(79, 23).addBox(-1.0F, -1.3F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.3898F, -0.9988F, -1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(52, 63).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.2971F, -0.0309F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(50, 54).addBox(-1.0F, -0.0921F, -0.7229F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.003F, -0.5688F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(73, 67).addBox(-1.0F, 0.7079F, -1.0229F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.4F, 0.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.6359F, 3.7361F, -8.5987F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(67, 25).addBox(-0.6688F, -0.4921F, -0.3229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.1653F, -4.2517F, 7.3865F, 0.0781F, -1.0971F, -0.1535F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(12, 67).addBox(-0.6688F, -0.4921F, -0.3229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1653F, -4.2517F, 7.3865F, 0.0553F, -0.8707F, -0.1263F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(66, 4).addBox(-0.6206F, -0.5804F, -0.3764F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4208F, -2.9664F, 6.1733F, 0.9914F, 0.0172F, -0.0866F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(85, 48).addBox(-0.7584F, -0.6741F, 0.0071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(35, 85).addBox(-0.7584F, -0.6741F, -0.3929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4208F, -3.8664F, 6.8733F, 0.3881F, -0.2263F, -0.0566F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(66, 0).addBox(-0.553F, -0.7747F, -0.3707F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4208F, -2.9664F, 6.1733F, 0.8514F, -0.0042F, -0.1343F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(66, 12).addBox(-0.2767F, -0.8478F, -1.4766F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.9877F, -2.6937F, 6.2193F, 0.5863F, 0.0708F, 0.3779F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(0, 31).addBox(-0.2767F, -0.9955F, -3.5709F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9877F, -2.6937F, 6.2193F, 0.7268F, 0.0839F, 0.3895F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(42, 31).addBox(-1.0F, -0.9046F, -2.9591F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8641F, -2.1884F, 6.171F, 0.5353F, 0.1702F, 0.0555F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(59, 0).addBox(0.0F, 0.0F, 0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4359F, -2.6647F, 1.8261F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(67, 21).addBox(-0.4F, -0.3F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.501F, 1.4679F, -1.1705F, 1.3985F, 0.0F, 0.0F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(36, 45).addBox(-0.7F, -0.2493F, -2.6398F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0521F, -1.459F, 1.1931F, 0.823F, -0.0185F, 0.0521F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(52, 58).addBox(-0.8F, -0.2493F, -1.8398F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3641F, -2.6859F, 2.3277F, 0.8356F, 0.0987F, 0.1601F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(9, 45).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0234F, -3.3266F, 4.7702F, 0.4993F, 0.4185F, -0.1267F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(18, 43).addBox(-0.8F, -0.5F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8542F, -3.3972F, 4.8983F, 0.5646F, 0.2312F, 0.0991F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(78, 82).addBox(1.0F, -0.3982F, 0.2857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.1359F, -2.0116F, 5.62F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(54, 34).addBox(-0.6295F, -0.5159F, -0.699F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4581F, -4.4521F, 5.4452F, -2.1737F, 0.4507F, 0.388F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(66, 65).addBox(0.0F, -0.6F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7896F, -0.0978F, 1.5222F, 0.4903F, -0.077F, 0.0083F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(84, 36).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2989F, -0.568F, 1.4782F, 1.0238F, 0.0438F, 0.1143F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(60, 31).addBox(0.04F, -0.8F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 79).addBox(0.0F, -0.8F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0641F, 0.1045F, 3.0437F, 0.4411F, 0.1423F, 0.0668F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(65, 35).addBox(-0.7F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0246F, -1.079F, 2.6064F, 0.405F, 0.1285F, 0.0549F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(84, 42).addBox(-0.3F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3387F, 0.621F, 0.3026F, -1.2611F, 0.0923F, 0.083F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(83, 83).addBox(-1.0F, 0.9857F, -1.1142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3641F, -2.6859F, 2.3277F, 0.2196F, 0.0165F, 0.0696F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(33, 67).addBox(-1.0F, -0.2805F, -2.539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8641F, -2.1884F, 6.171F, 0.5702F, 0.1702F, 0.0555F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(0, 37).addBox(-1.6887F, -0.5306F, -2.6708F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5073F, -4.3541F, 5.3057F, -2.6299F, -0.548F, -0.1467F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(24, 88).addBox(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(24, 88).addBox(-1.0F, -0.4F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0359F, -3.435F, 5.2531F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(24, 88).addBox(-1.9F, 0.9546F, -2.2657F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8641F, -5.2834F, 6.2701F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(66, 48).addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3217F, -4.2435F, 5.4988F, 2.9689F, -0.0834F, 0.0873F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(59, 65).addBox(-0.4F, -3.0F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3819F, -6.7263F, 6.1709F, 2.6373F, -0.0834F, 0.0873F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.6359F, 3.7361F, -8.5987F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(67, 25).mirror().addBox(-0.3312F, -0.4921F, -0.3229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.1653F, -4.2517F, 7.3865F, 0.0781F, 1.0971F, 0.1535F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(12, 67).mirror().addBox(-0.3312F, -0.4921F, -0.3229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1653F, -4.2517F, 7.3865F, 0.0553F, 0.8707F, 0.1263F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(66, 4).mirror().addBox(-0.3794F, -0.5804F, -0.3764F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4208F, -2.9664F, 6.1733F, 0.9914F, -0.0172F, 0.0866F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(85, 48).mirror().addBox(-0.2416F, -0.6741F, 0.0071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(35, 85).mirror().addBox(-0.2416F, -0.6741F, -0.3929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4208F, -3.8664F, 6.8733F, 0.3881F, 0.2263F, 0.0566F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-0.447F, -0.7747F, -0.3707F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4208F, -2.9664F, 6.1733F, 0.8514F, 0.0042F, 0.1343F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(66, 12).mirror().addBox(-0.7233F, -0.8478F, -1.4766F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.9877F, -2.6937F, 6.2193F, 0.5863F, -0.0708F, -0.3779F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-0.7233F, -0.9955F, -3.5709F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9877F, -2.6937F, 6.2193F, 0.7268F, -0.0839F, -0.3895F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(42, 31).mirror().addBox(0.0F, -0.9046F, -2.9591F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8641F, -2.1884F, 6.171F, 0.5353F, -0.1702F, -0.0555F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-1.0F, 0.0F, 0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4359F, -2.6647F, 1.8261F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(67, 21).mirror().addBox(-0.6F, -0.3F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.501F, 1.4679F, -1.1705F, 1.3985F, 0.0F, 0.0F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(36, 45).mirror().addBox(-0.3F, -0.2493F, -2.6398F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0521F, -1.459F, 1.1931F, 0.823F, 0.0185F, -0.0521F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(52, 58).mirror().addBox(-0.2F, -0.2493F, -1.8398F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3641F, -2.6859F, 2.3277F, 0.8356F, -0.0987F, -0.1601F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(9, 45).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0234F, -3.3266F, 4.7702F, 0.4993F, -0.4185F, 0.1267F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(18, 43).mirror().addBox(-0.2F, -0.5F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8542F, -3.3972F, 4.8983F, 0.5646F, -0.2312F, -0.0991F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(78, 82).mirror().addBox(-2.0F, -0.3982F, 0.2857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.1359F, -2.0116F, 5.62F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(54, 34).mirror().addBox(-1.3705F, -0.5159F, -0.699F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4581F, -4.4521F, 5.4452F, -2.1737F, -0.4507F, -0.388F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(66, 65).mirror().addBox(-1.0F, -0.6F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7896F, -0.0978F, 1.5222F, 0.4903F, 0.077F, -0.0083F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(84, 36).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2989F, -0.568F, 1.4782F, 1.0238F, -0.0438F, -0.1143F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(60, 31).mirror().addBox(-0.04F, -0.8F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 79).mirror().addBox(0.0F, -0.8F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0641F, 0.1045F, 3.0437F, 0.4411F, -0.1423F, -0.0668F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(65, 35).mirror().addBox(-0.3F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0246F, -1.079F, 2.6064F, 0.405F, -0.1285F, -0.0549F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(84, 42).mirror().addBox(-0.7F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3387F, 0.621F, 0.3026F, -1.2611F, -0.0923F, -0.083F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(83, 83).mirror().addBox(0.0F, 0.9857F, -1.1142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3641F, -2.6859F, 2.3277F, 0.2196F, -0.0165F, -0.0696F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(33, 67).mirror().addBox(0.0F, -0.2805F, -2.539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8641F, -2.1884F, 6.171F, 0.5702F, -0.1702F, -0.0555F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.3113F, -0.5306F, -2.6708F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5073F, -4.3541F, 5.3057F, -2.6299F, 0.548F, 0.1467F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(24, 88).mirror().addBox(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(24, 88).mirror().addBox(-1.0F, -0.4F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0359F, -3.435F, 5.2531F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(24, 88).mirror().addBox(-0.1F, 0.9546F, -2.2657F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8641F, -5.2834F, 6.2701F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(66, 48).mirror().addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3217F, -4.2435F, 5.4988F, 2.9689F, 0.0834F, -0.0873F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(59, 65).mirror().addBox(-0.6F, -3.0F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3819F, -6.7263F, 6.1709F, 2.6373F, 0.0834F, -0.0873F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1676F, -1.4077F, 0.2109F, -0.0007F, 0.0241F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(66, 52).mirror().addBox(-0.8F, -0.4F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.8183F, -7.2143F, -0.578F, 0.0956F, -0.0427F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(80, 12).mirror().addBox(-0.35F, -2.2999F, -0.9352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 1.4128F, -0.0675F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(68, 79).mirror().addBox(-0.35F, -1.0999F, -0.7352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.35F, 1.4128F, -0.0675F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(78, 70).mirror().addBox(-0.5F, -0.1F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.568F, 5.1946F, -2.5901F, -1.3999F, -0.0914F, -0.0856F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(22, 85).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3917F, 4.9431F, -4.8448F, -1.4543F, -0.2652F, -0.0884F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(85, 14).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3994F, 4.5553F, -4.9426F, -1.3147F, -0.2652F, -0.0884F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(83, 80).mirror().addBox(0.0F, -1.0366F, -0.9988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4537F, 5.6013F, -6.311F, -1.4368F, -0.2652F, -0.0884F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(83, 77).mirror().addBox(0.0F, 2.7634F, -1.2988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 4.727F, -2.7584F, -1.2623F, -0.2652F, -0.0884F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(0.0F, -2.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7299F, 3.972F, -4.6907F, -1.3489F, -0.083F, -0.1083F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(78, 61).mirror().addBox(-0.2162F, 0.0323F, -0.2522F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9629F, 3.771F, -2.7353F, -1.3126F, -0.0914F, -0.0856F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(55, 51).mirror().addBox(-0.1393F, -1.1891F, 2.9255F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9629F, 0.771F, -4.7353F, -0.982F, -0.0415F, -0.0696F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.2393F, -1.7891F, -0.3745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9629F, 3.771F, -2.7353F, -0.982F, -0.0415F, -0.0696F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(63, 79).mirror().addBox(-0.35F, 0.0118F, 0.0139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.35F, 1.1131F, -0.8093F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(19, 67).mirror().addBox(-0.35F, 0.0142F, -1.9282F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.35F, 2.0325F, 1.1433F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(66, 8).mirror().addBox(-0.35F, -0.0324F, -1.9234F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.35F, 4.6571F, 0.2232F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(59, 10).mirror().addBox(-0.35F, 0.0234F, -1.9716F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.35F, 2.9929F, 1.3193F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(79, 43).mirror().addBox(-0.5F, -1.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7595F, 3.5484F, -1.711F, -1.1566F, -0.0415F, -0.0696F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(78, 78).mirror().addBox(-0.2393F, -0.0642F, -1.0175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9633F, 5.0011F, -0.6649F, -1.4882F, -0.0415F, -0.0696F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(27, 85).mirror().addBox(-0.35F, -1.3469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 45).mirror().addBox(-0.35F, -1.9469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 1.4128F, -0.0675F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(58, 79).mirror().addBox(-0.35F, -0.9757F, 0.0586F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.35F, 1.4128F, -0.0675F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(80, 12).addBox(-0.65F, -2.2999F, -0.9352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.55F, 1.4128F, -0.0675F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(68, 79).addBox(-0.65F, -1.0999F, -0.7352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.35F, 1.4128F, -0.0675F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(78, 70).addBox(-0.5F, -0.1F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.568F, 5.1946F, -2.5901F, -1.3999F, 0.0914F, 0.0856F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(66, 52).addBox(-0.2F, -0.4F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 4.8183F, -7.2143F, -0.578F, -0.0956F, 0.0427F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(84, 22).addBox(-1.0F, -0.8012F, -1.3073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 5.6237F, -7.662F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(84, 19).addBox(-1.0F, -0.0005F, -0.9105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 5.559F, -7.072F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(22, 85).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3917F, 4.9431F, -4.8448F, -1.4543F, 0.2652F, 0.0884F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(85, 14).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3994F, 4.5553F, -4.9426F, -1.3147F, 0.2652F, 0.0884F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(83, 80).addBox(-1.0F, -1.0366F, -0.9988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4537F, 5.6013F, -6.311F, -1.4368F, 0.2652F, 0.0884F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(83, 77).addBox(-1.0F, 2.7634F, -1.2988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.727F, -2.7584F, -1.2623F, 0.2652F, 0.0884F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(11, 84).addBox(-1.0F, 0.0995F, -0.9105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.4493F, -6.1787F, -1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(0, 84).addBox(0.0F, -2.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7299F, 3.972F, -4.6907F, -1.3489F, 0.083F, 0.1083F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(78, 61).addBox(-0.7838F, 0.0323F, -0.2522F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9629F, 3.771F, -2.7353F, -1.3126F, 0.0914F, 0.0856F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(55, 51).addBox(0.1393F, -1.1891F, 2.9255F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9629F, 0.771F, -4.7353F, -0.982F, 0.0415F, 0.0696F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(0, 80).addBox(-0.7607F, -1.7891F, -0.3745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9629F, 3.771F, -2.7353F, -0.982F, 0.0415F, 0.0696F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(63, 79).addBox(-0.65F, 0.0118F, 0.0139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.35F, 1.1131F, -0.8093F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(19, 67).addBox(-0.65F, 0.0142F, -1.9282F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.35F, 2.0325F, 1.1433F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(66, 8).addBox(-0.65F, -0.0324F, -1.9234F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.35F, 4.6571F, 0.2232F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(59, 10).addBox(-0.65F, 0.0234F, -1.9716F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.35F, 2.9929F, 1.3193F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(79, 43).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7595F, 3.5484F, -1.711F, -1.1566F, 0.0415F, 0.0696F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(78, 78).addBox(-0.7607F, -0.0642F, -1.0175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9633F, 5.0011F, -0.6649F, -1.4882F, 0.0415F, 0.0696F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(27, 85).addBox(-0.65F, -1.3469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 45).addBox(-0.65F, -1.9469F, -1.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.55F, 1.4128F, -0.0675F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(58, 79).addBox(-0.65F, -0.9757F, 0.0586F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.35F, 1.4128F, -0.0675F, 0.2967F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(27, 40).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2344F, 2.7177F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(26, 25).addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.0497F, 2.8147F, -0.4102F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(13, 17).addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.1594F, 4.1193F, -0.4974F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 90, 90);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}