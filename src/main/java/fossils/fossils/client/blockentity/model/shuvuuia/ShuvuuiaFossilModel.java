package fossils.fossils.client.blockentity.model.shuvuuia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ShuvuuiaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart Bodyfront;
	private final ModelPart Neckbase;
	private final ModelPart neck;
	private final ModelPart Neckmiddle;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart Head;
	private final ModelPart Lowerjawbase;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Righthand;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Lefthand;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart Tailbase;
	private final ModelPart tail2;
	private final ModelPart Tailmiddlebase;
	private final ModelPart tail;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Tailend2;
	private final ModelPart Tailend3;
	private final ModelPart Tailend4;
	private final ModelPart Tailend5;
	private final ModelPart Tailend6;
	private final ModelPart Tailend7;
	private final ModelPart Tailend8;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Rightankle;
	private final ModelPart Rightfoot;
	private final ModelPart Rightfoot2;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Leftankle;
	private final ModelPart Leftfoot;
	private final ModelPart Leftfoot2;
	private final ModelPart bone3;
	private final ModelPart bone4;

	public ShuvuuiaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.Bodyfront = this.body3.getChild("Bodyfront");
		this.Neckbase = this.Bodyfront.getChild("Neckbase");
		this.neck = this.Neckbase.getChild("neck");
		this.Neckmiddle = this.neck.getChild("Neckmiddle");
		this.neck2 = this.Neckmiddle.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.Head = this.neck8.getChild("Head");
		this.Lowerjawbase = this.Head.getChild("Lowerjawbase");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Righthand = this.Rightlowerarm.getChild("Righthand");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Lefthand = this.Leftlowerarm.getChild("Lefthand");
		this.bone = this.Bodyfront.getChild("bone");
		this.bone2 = this.Bodyfront.getChild("bone2");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.tail2 = this.Tailbase.getChild("tail2");
		this.Tailmiddlebase = this.tail2.getChild("Tailmiddlebase");
		this.tail = this.Tailmiddlebase.getChild("tail");
		this.Tailmiddleend = this.tail.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Tailend2 = this.Tailend.getChild("Tailend2");
		this.Tailend3 = this.Tailend2.getChild("Tailend3");
		this.Tailend4 = this.Tailend3.getChild("Tailend4");
		this.Tailend5 = this.Tailend4.getChild("Tailend5");
		this.Tailend6 = this.Tailend5.getChild("Tailend6");
		this.Tailend7 = this.Tailend6.getChild("Tailend7");
		this.Tailend8 = this.Tailend7.getChild("Tailend8");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Rightankle = this.Rightshin.getChild("Rightankle");
		this.Rightfoot = this.Rightankle.getChild("Rightfoot");
		this.Rightfoot2 = this.Rightfoot.getChild("Rightfoot2");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Leftankle = this.Leftshin.getChild("Leftankle");
		this.Leftfoot = this.Leftankle.getChild("Leftfoot");
		this.Leftfoot2 = this.Leftfoot.getChild("Leftfoot2");
		this.bone3 = this.Hips.getChild("bone3");
		this.bone4 = this.Hips.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -21.1F, 12.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -25.7195F, -7.2051F, -0.4477F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(76, 92).addBox(0.0F, -2.315F, -0.051F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8298F, 0.0353F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(41, 92).addBox(0.0F, -5.2F, -2.5F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9702F, -0.5647F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(62, 35).mirror().addBox(-1.5F, -2.6F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 35).addBox(0.5F, -2.6F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 35).addBox(-0.5F, -2.8F, -4.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.9702F, 0.4353F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.3678F, -3.6167F, -0.0286F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(112, 89).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0068F, -1.4329F, -0.0382F, -0.0192F, -0.5304F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(103, 43).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0068F, -1.4329F, -0.031F, -0.0107F, -1.0016F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(103, 43).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0068F, -1.4329F, -0.031F, 0.0107F, 1.0016F));

		PartDefinition cube_r7 = Bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(112, 89).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0068F, -1.4329F, -0.0382F, 0.0192F, 0.5304F));

		PartDefinition cube_r8 = Bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(78, 17).addBox(-0.49F, -2.5F, 2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1892F, -5.8242F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Bodymiddle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(50, 93).addBox(0.01F, -2.6814F, 0.9061F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3386F, -3.357F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0392F, -3.4242F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(87, 22).addBox(0.01F, -2.4913F, 0.9795F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -6.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(111, 26).mirror().addBox(-3.2375F, -1.8712F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.096F, -1.0837F, -0.0089F, 0.1209F, -1.5014F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(100, 50).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.096F, -1.0837F, 0.0549F, 0.1082F, -0.9569F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(111, 79).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.096F, -1.0837F, 0.0922F, 0.0479F, -0.488F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 112).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.9837F, 0.1601F, 0.0878F, -0.4664F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(101, 29).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.9837F, 0.0978F, 0.1744F, -0.9339F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(89, 32).mirror().addBox(-5.2375F, -1.8712F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.9837F, -0.0071F, 0.1996F, -1.4842F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(89, 32).addBox(2.2375F, -1.8712F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.9837F, -0.0071F, -0.1996F, 1.4842F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, 0.1F, 5.0F, 3.0F, 10.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.01F, 10.9677F, 0.953F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 14).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 11.8979F, -6.9046F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(101, 29).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.9837F, 0.0978F, -0.1744F, 0.9339F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 112).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.9837F, 0.1601F, -0.0878F, 0.4664F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(111, 79).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.096F, -1.0837F, 0.0922F, -0.0479F, 0.488F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(100, 50).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.096F, -1.0837F, 0.0549F, -0.1082F, 0.9569F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(111, 26).addBox(2.2375F, -1.8712F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.096F, -1.0837F, -0.0089F, -0.1209F, 1.5014F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(48, 0).addBox(-0.49F, -2.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(28, 90).addBox(0.01F, -2.5513F, -0.0922F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.328F, -1.9347F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2641F, -5.9944F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(92, 0).addBox(0.01F, -2.55F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2882F, -5.0298F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(112, 0).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -3.8837F, 0.1956F, 0.1358F, -0.3984F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(48, 69).mirror().addBox(-8.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -3.8837F, -0.0302F, 0.2548F, -1.4254F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(101, 96).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -3.8837F, 0.1078F, 0.2332F, -0.8678F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(15, 56).mirror().addBox(-7.2375F, -1.8712F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -0.8837F, -0.0322F, 0.238F, -1.443F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(5, 112).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -0.8837F, 0.1801F, 0.1288F, -0.4176F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(101, 98).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -0.8837F, 0.0971F, 0.22F, -0.8874F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(101, 98).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -0.8837F, 0.0971F, -0.22F, 0.8874F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(5, 112).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -0.8837F, 0.1801F, -0.1288F, 0.4176F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(15, 56).addBox(2.2375F, -1.8712F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -0.8837F, -0.0322F, -0.238F, 1.443F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(101, 96).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -3.8837F, 0.1078F, -0.2332F, 0.8678F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(48, 69).addBox(2.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -3.8837F, -0.0302F, -0.2548F, 1.4254F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(112, 0).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -3.8837F, 0.1956F, -0.1358F, 0.3984F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 26).addBox(-2.5F, -2.0F, 0.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 11.2164F, -7.6091F, -0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(47, 47).addBox(-0.49F, -2.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(81, 90).addBox(0.01F, -2.6513F, -0.0922F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.328F, -1.9347F, 0.0087F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.275F, -6.0F));

		PartDefinition cube_r43 = body3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(61, 14).mirror().addBox(-9.2375F, -1.8712F, -0.5598F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -0.9838F, -0.0123F, 0.2702F, -1.4525F));

		PartDefinition cube_r44 = body3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(10, 105).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -0.9838F, 0.1314F, 0.2371F, -0.8941F));

		PartDefinition cube_r45 = body3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(10, 113).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -0.9838F, 0.218F, 0.1291F, -0.4272F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(27, 24).mirror().addBox(-9.2375F, -1.8712F, -0.5599F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.9838F, -0.0123F, 0.2702F, -1.4525F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(104, 8).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.9838F, 0.1314F, 0.2371F, -0.8941F));

		PartDefinition cube_r48 = body3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(112, 112).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.9838F, 0.218F, 0.1291F, -0.4272F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(112, 112).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.9838F, 0.218F, -0.1291F, 0.4272F));

		PartDefinition cube_r50 = body3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(104, 8).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.9838F, 0.1314F, -0.2371F, 0.8941F));

		PartDefinition cube_r51 = body3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(27, 24).addBox(2.2375F, -1.8712F, -0.5599F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.9838F, -0.0123F, -0.2702F, 1.4525F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(10, 113).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -0.9838F, 0.218F, -0.1291F, 0.4272F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(10, 105).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -0.9838F, 0.1314F, -0.2371F, 0.8941F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(61, 14).addBox(2.2375F, -1.8712F, -0.5598F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -0.9838F, -0.0123F, -0.2702F, 1.4525F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(23, 26).addBox(-2.5F, -2.0F, -5.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 10.9123F, -1.6055F, -0.144F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(30, 58).addBox(-0.49F, -2.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(14, 95).addBox(0.01F, -2.1513F, -3.0922F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 95).addBox(0.01F, -2.4513F, -0.0922F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.328F, -1.9347F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body3.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(62, 112).addBox(0.01F, -1.4997F, -6.0438F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.044F, -3.9421F, 0.0369F, 0.0F, 0.0F));

		PartDefinition cube_r58 = Bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(79, 32).mirror().addBox(-2.4F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9848F, 7.933F, -5.8321F, 0.4985F, 0.6579F, 0.5963F));

		PartDefinition cube_r59 = Bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(64, 52).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5198F, 8.4529F, -5.2417F, 0.4754F, 0.8973F, 0.3444F));

		PartDefinition cube_r60 = Bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(49, 17).mirror().addBox(-5.5F, 0.3F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7265F, 8.1776F, -4.8707F, 0.0582F, 1.0618F, 0.0141F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(102, 61).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -2.8837F, 0.1475F, 0.2636F, -0.8553F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(27, 22).mirror().addBox(-9.2375F, -1.8712F, -0.5599F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -2.8837F, -0.0132F, 0.301F, -1.4179F));

		PartDefinition cube_r63 = Bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(112, 49).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -2.8837F, 0.2441F, 0.1457F, -0.3888F));

		PartDefinition cube_r64 = Bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(63, 69).mirror().addBox(-8.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.4676F, -5.5187F, 0.1773F, 0.429F, -1.4654F));

		PartDefinition cube_r65 = Bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(57, 112).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.4676F, -5.5187F, 0.4484F, 0.0634F, -0.4832F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(102, 63).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.4676F, -5.5187F, 0.3744F, 0.2775F, -0.9101F));

		PartDefinition cube_r67 = Bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(102, 63).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.4676F, -5.5187F, 0.3744F, -0.2775F, 0.9101F));

		PartDefinition cube_r68 = Bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(57, 112).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.4676F, -5.5187F, 0.4484F, -0.0634F, 0.4832F));

		PartDefinition cube_r69 = Bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(63, 69).addBox(2.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.4676F, -5.5187F, 0.1773F, -0.429F, 1.4654F));

		PartDefinition cube_r70 = Bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(97, 70).addBox(0.01F, -1.8818F, -2.0391F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2872F, -1.9452F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r71 = Bodyfront.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(112, 49).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -2.8837F, 0.2441F, -0.1457F, 0.3888F));

		PartDefinition cube_r72 = Bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(27, 22).addBox(2.2375F, -1.8712F, -0.5599F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -2.8837F, -0.0132F, -0.301F, 1.4179F));

		PartDefinition cube_r73 = Bodyfront.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(102, 61).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -2.8837F, 0.1475F, -0.2636F, 0.8553F));

		PartDefinition cube_r74 = Bodyfront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(49, 17).addBox(-0.5F, 0.3F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7465F, 8.1776F, -4.8707F, 0.0582F, -1.0618F, -0.0141F));

		PartDefinition cube_r75 = Bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(64, 52).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5398F, 8.4529F, -5.2417F, 0.4754F, -0.8973F, -0.3444F));

		PartDefinition cube_r76 = Bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(79, 32).addBox(-0.6F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0048F, 7.933F, -5.8321F, 0.4985F, -0.6579F, -0.5963F));

		PartDefinition cube_r77 = Bodyfront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 61).addBox(-0.49F, -0.75F, -5.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4128F, -0.1452F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5576F, -5.8087F, 0.2276F, 0.0F, 0.0F));

		PartDefinition cube_r78 = Neckbase.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(112, 85).addBox(0.01F, -1.7F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2024F, -3.6736F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r79 = Neckbase.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(54, 112).addBox(0.01F, -1.6F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7866F, -1.7173F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r80 = Neckbase.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(102, 23).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.4035F, -1.548F, 0.2434F, 0.1119F, -0.9876F));

		PartDefinition cube_r81 = Neckbase.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(73, 61).mirror().addBox(-7.2375F, -1.8712F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.4035F, -1.548F, 0.152F, 0.2209F, -1.5255F));

		PartDefinition cube_r82 = Neckbase.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(112, 20).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.4035F, -1.548F, 0.2617F, -0.032F, -0.5381F));

		PartDefinition cube_r83 = Neckbase.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(91, 46).mirror().addBox(-5.2375F, -1.8712F, -0.5599F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.7035F, -3.548F, 0.1562F, 0.308F, -1.5244F));

		PartDefinition cube_r84 = Neckbase.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(87, 112).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.7035F, -3.548F, 0.3366F, 0.0128F, -0.5388F));

		PartDefinition cube_r85 = Neckbase.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(102, 65).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.7035F, -3.548F, 0.2923F, 0.1846F, -0.9804F));

		PartDefinition cube_r86 = Neckbase.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(102, 65).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.7035F, -3.548F, 0.2923F, -0.1846F, 0.9804F));

		PartDefinition cube_r87 = Neckbase.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(87, 112).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.7035F, -3.548F, 0.3366F, -0.0128F, 0.5388F));

		PartDefinition cube_r88 = Neckbase.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(91, 46).addBox(2.2375F, -1.8712F, -0.5599F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.7035F, -3.548F, 0.1562F, -0.308F, 1.5244F));

		PartDefinition cube_r89 = Neckbase.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(112, 20).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.4035F, -1.548F, 0.2617F, 0.032F, 0.5381F));

		PartDefinition cube_r90 = Neckbase.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(73, 61).addBox(2.2375F, -1.8712F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.4035F, -1.548F, 0.152F, -0.2209F, 1.5255F));

		PartDefinition cube_r91 = Neckbase.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(102, 23).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.4035F, -1.548F, 0.2434F, -0.1119F, 0.9876F));

		PartDefinition cube_r92 = Neckbase.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(61, 8).addBox(-2.0166F, 1.1974F, -2.8727F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0266F, 6.1887F, -1.0169F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r93 = Neckbase.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(62, 47).addBox(-2.5166F, 2.165F, -4.6191F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0266F, 6.1887F, -1.0169F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r94 = Neckbase.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(13, 66).addBox(-0.49F, -1.0987F, 0.4368F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2314F, -4.4422F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck = Neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7223F, -3.6844F, -0.7892F, 0.2528F, 0.2433F));

		PartDefinition cube_r95 = neck.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(112, 16).addBox(0.01F, -1.382F, -0.1524F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4598F, -3.8812F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r96 = neck.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(100, 111).addBox(0.01F, -2.182F, -1.2524F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1828F, -0.6879F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r97 = neck.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(7, 84).mirror().addBox(-0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2964F, -3.8816F, -0.3664F, -0.1739F, -0.0076F));

		PartDefinition cube_r98 = neck.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(84, 39).mirror().addBox(-0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.3149F, -1.8967F, -0.3221F, -0.1304F, -0.0115F));

		PartDefinition cube_r99 = neck.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(84, 39).addBox(0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.3149F, -1.8967F, -0.3221F, 0.1304F, 0.0115F));

		PartDefinition cube_r100 = neck.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(7, 84).addBox(0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2964F, -3.8816F, -0.3664F, 0.1739F, 0.0076F));

		PartDefinition cube_r101 = neck.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(61, 63).addBox(-0.49F, -0.682F, -3.2524F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1828F, -0.6879F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Neckmiddle = neck.addOrReplaceChild("Neckmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0618F, -3.6729F, -0.4799F, 0.1665F, 0.3082F));

		PartDefinition cube_r102 = Neckmiddle.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(51, 112).addBox(0.01F, -1.0328F, -0.0025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0827F, -4.0526F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r103 = Neckmiddle.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(25, 112).addBox(0.01F, -1.6828F, -1.4025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(24, 71).addBox(-0.49F, -0.6828F, -3.4025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.5849F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r104 = Neckmiddle.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(23, 104).mirror().addBox(0.0152F, -0.4037F, 0.0518F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.6443F, -2.2072F, 0.0007F, -0.1304F, -0.0115F));

		PartDefinition cube_r105 = Neckmiddle.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(101, 15).mirror().addBox(-0.1973F, -0.2718F, -0.0566F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.295F, 0.6432F, -3.6945F, -0.1563F, -0.1304F, -0.0115F));

		PartDefinition cube_r106 = Neckmiddle.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(101, 15).addBox(0.1973F, -0.2718F, -0.0566F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.315F, 0.6432F, -3.6945F, -0.1563F, 0.1304F, 0.0115F));

		PartDefinition cube_r107 = Neckmiddle.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(23, 104).addBox(-0.0152F, -0.4037F, 0.0518F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.6443F, -2.2072F, 0.0007F, 0.1304F, 0.0115F));

		PartDefinition neck2 = Neckmiddle.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9861F, -4.0023F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r108 = neck2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(78, 68).addBox(0.0F, -0.725F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -0.091F, -2.1311F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r109 = neck2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(75, 34).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2772F, -0.1148F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r110 = neck2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(100, 92).mirror().addBox(0.0233F, -0.7767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.9951F, -1.802F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r111 = neck2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(100, 92).addBox(-0.0233F, -0.7767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.9951F, -1.802F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -2.7F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r112 = neck5.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(97, 25).addBox(0.0F, -0.425F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 90).addBox(0.0F, -0.725F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -0.091F, -2.1311F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r113 = neck5.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(70, 76).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.2772F, -0.1148F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r114 = neck5.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(100, 101).mirror().addBox(0.0233F, -0.9767F, 1.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 102).mirror().addBox(-0.1897F, -0.7279F, -0.4706F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.9951F, -1.802F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r115 = neck5.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(0, 102).addBox(0.1897F, -0.7279F, -0.4706F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(100, 101).addBox(-0.0233F, -0.9767F, 1.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.9951F, -1.802F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.475F, -3.0F, -0.0906F, -0.2941F, 0.1933F));

		PartDefinition cube_r116 = neck6.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(113, 28).addBox(0.0F, -0.525F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.709F, -1.8311F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r117 = neck6.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(20, 77).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5228F, 0.1852F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r118 = neck6.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(102, 0).mirror().addBox(0.0233F, -0.8767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 1.7951F, -1.502F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r119 = neck6.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(102, 0).addBox(-0.0233F, -0.8767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 1.7951F, -1.502F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3147F, -2.7081F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r120 = neck7.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(15, 113).addBox(0.0F, -0.525F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.709F, -1.8311F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r121 = neck7.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(44, 77).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5228F, 0.1852F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r122 = neck7.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(5, 102).mirror().addBox(0.0233F, -0.8767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 1.7951F, -1.502F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r123 = neck7.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(5, 102).addBox(-0.0233F, -0.8767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 1.7951F, -1.502F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.29F, -2.7078F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r124 = neck8.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(28, 113).addBox(0.0F, -0.325F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.709F, -1.8311F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r125 = neck8.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(30, 65).addBox(-0.49F, -0.6F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5228F, 0.1852F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r126 = neck8.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(102, 19).mirror().addBox(0.0233F, -0.8767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 1.7951F, -1.502F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r127 = neck8.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(102, 19).addBox(-0.0233F, -0.8767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 1.7951F, -1.502F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition Head = neck8.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1041F, 2.3407F, -3.2908F, 1.2959F, 0.0058F, 0.0886F));

		PartDefinition cube_r128 = Head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(48, 63).addBox(-1.5F, -2.0668F, 0.4896F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.8651F, -3.4627F, -1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r129 = Head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(70, 71).addBox(-1.5F, -2.1968F, -2.1571F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.8651F, -3.4627F, 2.6704F, 0.0F, 0.0F));

		PartDefinition cube_r130 = Head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(0, 44).addBox(-1.5F, -3.2932F, -3.0398F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.7414F, -3.7025F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r131 = Head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(18, 82).addBox(-1.5F, -0.6F, -0.675F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.1172F, -2.0092F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r132 = Head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(108, 52).addBox(-0.5F, -0.625F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.9916F, -0.3879F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r133 = Head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(15, 53).addBox(-1.0F, -1.975F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(85, 81).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.7826F, -0.5545F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r134 = Head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(82, 58).addBox(-1.5F, -0.4F, -0.55F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.1166F, -0.8993F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r135 = Head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(81, 68).addBox(-1.5F, -4.21F, 0.6662F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.7414F, -3.7025F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r136 = Head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(82, 54).addBox(-1.5F, -1.25F, -0.45F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.7547F, -2.7685F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r137 = Head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(60, 82).addBox(-1.5F, -0.7227F, 0.4926F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5414F, -3.4025F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r138 = Head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(81, 73).addBox(-1.5F, -1.0F, 0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9809F, -4.0681F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r139 = Head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(34, 81).addBox(-1.5F, -3.0205F, 0.0021F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.6016F, -4.0801F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r140 = Head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 74).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.5578F, -5.0755F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r141 = Head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(108, 37).addBox(0.5F, -0.6981F, -3.1697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(69, 93).addBox(0.5F, -0.6981F, -5.1697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.6812F, -7.3386F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r142 = Head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(99, 105).addBox(-0.5F, -0.3136F, -0.5967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.3231F, -16.5075F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r143 = Head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(105, 100).addBox(-0.5F, -0.5517F, -0.7765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(108, 34).addBox(-0.5F, -0.5517F, -0.2515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 2.3231F, -16.5075F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r144 = Head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(48, 108).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.534F, -15.6751F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r145 = Head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(24, 96).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.2288F, -14.1045F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r146 = Head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(95, 75).addBox(0.0F, -0.7176F, -6.9682F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.6812F, -7.3386F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r147 = Head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(72, 63).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1304F, -5.7372F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r148 = Head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(78, 27).addBox(0.5F, -0.9237F, -2.1795F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.6812F, -7.3386F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r149 = Head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(74, 0).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.005F, -1.3788F, -5.3402F, -1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r150 = Head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(43, 82).addBox(-1.495F, 0.0131F, -0.9312F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.6481F, -4.4486F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r151 = Head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(84, 105).addBox(-0.5F, -0.0888F, 0.9105F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.6651F, -4.3627F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r152 = Head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(52, 35).addBox(-1.5F, 0.0067F, -0.076F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.6651F, -4.3627F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r153 = Head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(93, 48).addBox(-0.5F, -2.428F, -0.1132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6651F, -4.3627F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r154 = Head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(35, 86).addBox(-0.5F, 0.8647F, -1.7187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -2.0651F, -1.9627F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r155 = Head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(59, 102).addBox(-0.5F, -0.0851F, -0.0733F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -2.0651F, -1.9627F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.6631F, -2.2936F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r156 = Lowerjawbase.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(95, 84).mirror().addBox(-0.5F, -1.1013F, -1.7463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(95, 84).addBox(1.7F, -1.1013F, -1.7463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.1F, 0.8546F, 0.3171F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r157 = Lowerjawbase.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(90, 71).mirror().addBox(-0.6319F, 0.2218F, 2.2107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.0478F, 0.4219F, -0.1604F, 0.0161F));

		PartDefinition cube_r158 = Lowerjawbase.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(62, 93).mirror().addBox(-0.6319F, -0.3327F, 0.9481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.0478F, 0.2037F, -0.1604F, 0.0161F));

		PartDefinition cube_r159 = Lowerjawbase.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(95, 61).mirror().addBox(-0.3146F, -0.7301F, -0.3529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.0478F, -0.094F, -0.4164F, -0.0412F));

		PartDefinition cube_r160 = Lowerjawbase.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(110, 91).mirror().addBox(-0.5F, 0.2087F, -0.6279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(110, 91).addBox(1.7F, 0.2087F, -0.6279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-1.1F, 1.2157F, -1.332F, -1.2348F, 0.0F, 0.0F));

		PartDefinition cube_r161 = Lowerjawbase.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(110, 100).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(111, 6).mirror().addBox(-0.5F, 0.375F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(111, 13).mirror().addBox(-0.5F, 0.95F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(20, 111).mirror().addBox(-0.5F, 1.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(20, 111).addBox(1.7F, 1.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(111, 13).addBox(1.7F, 0.95F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(111, 6).addBox(1.7F, 0.375F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(110, 100).addBox(1.7F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 1.714F, -2.2271F, -1.5403F, 0.0F, 0.0F));

		PartDefinition cube_r162 = Lowerjawbase.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(105, 45).mirror().addBox(-0.5F, 1.2948F, -0.6069F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(105, 45).addBox(1.7F, 1.2948F, -0.6069F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.1F, 1.2157F, -1.332F, -1.549F, 0.0F, 0.0F));

		PartDefinition cube_r163 = Lowerjawbase.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(79, 105).mirror().addBox(-0.7646F, -0.229F, -0.6278F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.2843F, 1.5204F, -6.5637F, -1.4919F, -0.0761F, -0.0244F));

		PartDefinition cube_r164 = Lowerjawbase.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(98, 42).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(98, 42).addBox(1.7F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, 0.3709F, -3.0712F, -1.4355F, 0.0F, 0.0F));

		PartDefinition cube_r165 = Lowerjawbase.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(110, 103).mirror().addBox(-0.5F, -0.3552F, -0.6568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(110, 103).addBox(1.7F, -0.3552F, -0.6568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1F, 1.2157F, -1.332F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r166 = Lowerjawbase.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(24, 66).mirror().addBox(-0.5F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(24, 66).mirror().addBox(-0.5F, -1.5F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(24, 66).addBox(1.7F, -1.5F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(24, 66).addBox(1.7F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.1F, 0.5145F, -1.7442F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r167 = Lowerjawbase.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(105, 91).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(105, 91).addBox(1.7F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.1F, -0.1262F, -0.5444F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r168 = Lowerjawbase.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(101, 25).mirror().addBox(-0.5F, -1.7448F, -0.2567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(101, 25).addBox(1.7F, -1.7448F, -0.2567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1F, 0.1615F, 1.1984F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r169 = Lowerjawbase.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(70, 97).mirror().addBox(-0.5F, -2.7948F, -0.4567F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(70, 97).addBox(1.7F, -2.7948F, -0.4567F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, -0.0446F, 1.2057F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r170 = Lowerjawbase.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(28, 86).mirror().addBox(-0.5F, -0.8218F, -2.0341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(28, 86).addBox(1.7F, -0.8218F, -2.0341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.1F, 1.2157F, -1.332F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r171 = Lowerjawbase.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(88, 88).mirror().addBox(-0.7614F, -0.9321F, -3.2846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.2843F, 1.5204F, -6.5637F, 0.2623F, -0.0741F, -0.0327F));

		PartDefinition cube_r172 = Lowerjawbase.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(73, 110).mirror().addBox(-0.6899F, -0.2723F, -4.4879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(46, 19).mirror().addBox(-0.6899F, -0.2723F, -3.6879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0843F, 1.7204F, -9.7637F, 0.1999F, -0.0241F, -0.0222F));

		PartDefinition cube_r173 = Lowerjawbase.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(5, 109).mirror().addBox(-0.6899F, -0.5313F, -2.8987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0843F, 1.7204F, -9.7637F, 0.2872F, -0.0241F, -0.0222F));

		PartDefinition cube_r174 = Lowerjawbase.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(109, 10).mirror().addBox(-0.6899F, -0.5941F, -2.0982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(25, 109).mirror().addBox(-0.6899F, -0.5941F, -1.2982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0843F, 1.7204F, -9.7637F, 0.3221F, -0.0241F, -0.0222F));

		PartDefinition cube_r175 = Lowerjawbase.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(48, 71).mirror().addBox(-0.7173F, -0.3047F, -3.6777F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.0843F, 1.7204F, -9.7637F, 0.2606F, -0.0218F, -0.0326F));

		PartDefinition cube_r176 = Lowerjawbase.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(54, 101).mirror().addBox(-0.7173F, 2.653F, -0.2255F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.0843F, 1.7204F, -9.7637F, -1.3364F, -0.0218F, -0.0326F));

		PartDefinition cube_r177 = Lowerjawbase.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-0.5F, -0.45F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F)).mirror(false)
				.texOffs(0, 89).addBox(1.95F, -0.45F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(-1.225F, 1.1348F, -3.1281F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r178 = Lowerjawbase.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(38, 110).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false)
				.texOffs(110, 46).mirror().addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(107, 76).mirror().addBox(-0.5F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false)
				.texOffs(109, 61).mirror().addBox(-0.5F, -0.3F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(109, 61).addBox(1.95F, -0.3F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(107, 76).addBox(1.95F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F))
				.texOffs(110, 46).addBox(1.95F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F))
				.texOffs(38, 110).addBox(1.95F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(-1.225F, 0.82F, -2.4311F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r179 = Lowerjawbase.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(49, 104).mirror().addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(49, 104).addBox(1.95F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.225F, 1.5131F, -2.3337F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r180 = Lowerjawbase.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(43, 110).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(110, 43).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(110, 43).addBox(1.95F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F))
				.texOffs(43, 110).addBox(1.95F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.225F, 1.4575F, -1.9376F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r181 = Lowerjawbase.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(50, 89).mirror().addBox(-0.7614F, -0.8268F, -1.7321F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.2843F, 1.5204F, -6.5637F, 0.1925F, -0.0741F, -0.0327F));

		PartDefinition cube_r182 = Lowerjawbase.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(75, 44).mirror().addBox(-0.1522F, -1.1146F, -2.441F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-1.3843F, 1.5204F, -4.4637F, 0.1407F, -0.2224F, -0.0334F));

		PartDefinition cube_r183 = Lowerjawbase.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(35, 76).mirror().addBox(-0.1522F, -0.5631F, -2.5475F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.3843F, 1.5204F, -4.4637F, -0.012F, -0.2224F, -0.0334F));

		PartDefinition cube_r184 = Lowerjawbase.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(54, 101).addBox(-0.2827F, 2.653F, -0.2255F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0843F, 1.7204F, -9.7637F, -1.3364F, 0.0218F, 0.0326F));

		PartDefinition cube_r185 = Lowerjawbase.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(48, 71).addBox(-0.2827F, -0.3047F, -3.6777F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0843F, 1.7204F, -9.7637F, 0.2606F, 0.0218F, 0.0326F));

		PartDefinition cube_r186 = Lowerjawbase.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(25, 109).addBox(-0.3101F, -0.5941F, -1.2982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(109, 10).addBox(-0.3101F, -0.5941F, -2.0982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0843F, 1.7204F, -9.7637F, 0.3221F, 0.0241F, 0.0222F));

		PartDefinition cube_r187 = Lowerjawbase.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(5, 109).addBox(-0.3101F, -0.5313F, -2.8987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0843F, 1.7204F, -9.7637F, 0.2872F, 0.0241F, 0.0222F));

		PartDefinition cube_r188 = Lowerjawbase.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(46, 19).addBox(-0.3101F, -0.2723F, -3.6879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(73, 110).addBox(-0.3101F, -0.2723F, -4.4879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0843F, 1.7204F, -9.7637F, 0.1999F, 0.0241F, 0.0222F));

		PartDefinition cube_r189 = Lowerjawbase.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(35, 76).addBox(-0.8478F, -0.5631F, -2.5475F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.3843F, 1.5204F, -4.4637F, -0.012F, 0.2224F, 0.0334F));

		PartDefinition cube_r190 = Lowerjawbase.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(75, 44).addBox(-0.8478F, -1.1146F, -2.441F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(1.3843F, 1.5204F, -4.4637F, 0.1407F, 0.2224F, 0.0334F));

		PartDefinition cube_r191 = Lowerjawbase.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(50, 89).addBox(-0.2386F, -0.8268F, -1.7321F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.2843F, 1.5204F, -6.5637F, 0.1925F, 0.0741F, 0.0327F));

		PartDefinition cube_r192 = Lowerjawbase.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(88, 88).addBox(-0.2386F, -0.9321F, -3.2846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.2843F, 1.5204F, -6.5637F, 0.2623F, 0.0741F, 0.0327F));

		PartDefinition cube_r193 = Lowerjawbase.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(79, 105).addBox(-0.2354F, -0.229F, -0.6278F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.2843F, 1.5204F, -6.5637F, -1.4919F, 0.0761F, 0.0244F));

		PartDefinition cube_r194 = Lowerjawbase.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(95, 61).addBox(-0.6854F, -0.7301F, -0.3529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.0478F, -0.094F, 0.4164F, 0.0412F));

		PartDefinition cube_r195 = Lowerjawbase.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(62, 93).addBox(-0.3681F, -0.3327F, 0.9481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.0478F, 0.2037F, 0.1604F, -0.0161F));

		PartDefinition cube_r196 = Lowerjawbase.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(90, 71).addBox(-0.3681F, 0.2218F, 2.2107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.0478F, 0.4219F, 0.1604F, -0.0161F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.3F, 0.3064F, -4.1747F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(87, 28).addBox(-0.175F, -0.1275F, -1.5985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1368F, 1.0716F, -9.8714F, 0.1805F, -0.0019F, 0.0336F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(30, 110).addBox(-0.1601F, -0.4702F, -2.4849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1368F, 1.0716F, -9.8714F, 0.417F, 0.034F, 0.0036F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(100, 46).addBox(-0.1677F, -0.6035F, 0.407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1368F, 1.0716F, -9.8714F, -1.5812F, 0.034F, -0.0018F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(20, 108).addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5301F, 1.9958F, -8.7862F, 0.0079F, 0.0954F, -0.0141F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(80, 101).addBox(-0.0245F, 0.5517F, 0.5158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1368F, 1.0716F, -9.8714F, -1.5114F, 0.032F, -0.0072F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(94, 105).addBox(-0.0245F, 0.8115F, -2.9598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1368F, 1.0716F, -9.8714F, -0.0715F, 0.032F, -0.0072F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(104, 10).addBox(-0.0245F, -2.8924F, -0.7722F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1368F, 1.0716F, -9.8714F, 1.8047F, 0.032F, -0.0072F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(10, 110).addBox(-0.0245F, -0.9237F, -3.3935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1368F, 1.0716F, -9.8714F, 0.4958F, 0.032F, -0.0072F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(79, 76).addBox(-0.1601F, 0.1333F, -1.1797F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1368F, 1.0716F, -9.8714F, 0.1639F, 0.034F, 0.0036F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(63, 0).addBox(-0.35F, -1.0F, -1.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.6963F, 0.8023F, -4.8823F, 0.221F, -0.0043F, 0.18F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(63, 0).addBox(-0.25F, -1.0F, -1.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6963F, 0.8023F, -4.8823F, 0.2218F, 0.0808F, 0.1991F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(59, 71).addBox(-0.4922F, -1.2635F, 2.8612F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3868F, 2.4716F, -12.6714F, 0.1766F, 0.022F, 0.1611F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(9, 79).addBox(-0.5091F, -0.6219F, 4.6734F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3868F, 2.4716F, -12.6714F, 0.2201F, 0.0381F, 0.0393F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(94, 80).addBox(0.1753F, -0.5504F, -2.6039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.1368F, 1.0716F, -9.8714F, 0.3473F, 0.0324F, 0.005F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(94, 16).addBox(0.1753F, -0.4068F, 0.5222F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1368F, 1.0716F, -9.8714F, -2.7245F, 0.0324F, 0.005F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(104, 109).addBox(0.1753F, 1.8781F, -0.2468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(0.1368F, 1.0716F, -9.8714F, -1.3108F, 0.0324F, 0.005F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(109, 106).addBox(0.1753F, 1.8951F, -1.0431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1368F, 1.0716F, -9.8714F, -1.0054F, 0.0324F, 0.005F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(59, 106).addBox(-0.489F, -0.8715F, -1.0938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(93, 92).addBox(-0.489F, -0.4715F, -0.6188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F))
				.texOffs(69, 106).addBox(-0.489F, -0.8715F, 0.6812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(87, 14).addBox(-0.489F, -0.8715F, -0.9188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.8867F, 1.495F, -6.4586F, 0.1395F, 0.0564F, 0.0125F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(105, 103).addBox(-0.489F, 0.6885F, 0.5622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.8867F, 1.495F, -6.4586F, 1.143F, 0.0564F, 0.0125F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(107, 73).addBox(-0.489F, 0.9976F, -0.7519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(74, 107).addBox(-0.489F, 0.9976F, -1.8519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(107, 70).addBox(-0.489F, 0.9976F, -1.2519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8867F, 1.495F, -6.4586F, 1.972F, 0.0564F, 0.0125F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(34, 103).addBox(-0.489F, -1.1259F, -1.8554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.8867F, 1.495F, -6.4586F, -3.0894F, 0.0564F, 0.0125F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(87, 10).addBox(-0.489F, -0.8334F, -2.6069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8867F, 1.495F, -6.4586F, 2.8883F, 0.0564F, 0.0125F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(59, 86).addBox(-0.489F, -0.623F, -1.4798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(86, 49).addBox(-0.489F, -1.023F, -1.4798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.8867F, 1.495F, -6.4586F, 3.0192F, 0.0564F, 0.0125F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(107, 20).addBox(-0.489F, -0.5803F, 0.0149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(107, 17).addBox(-0.489F, 0.8947F, 0.7899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(107, 67).addBox(-0.489F, 0.2197F, 0.0149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 107).addBox(-0.489F, 0.0197F, 0.0149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.8867F, 1.495F, -6.4586F, -2.3913F, 0.0564F, 0.0125F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(103, 31).addBox(-0.3891F, -2.0035F, -1.5962F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.8867F, 1.495F, -6.4586F, 0.794F, 0.0564F, 0.0125F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(107, 49).addBox(-0.3891F, -1.8918F, -1.1617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(43, 107).addBox(-0.3891F, -1.5668F, -1.1617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(38, 107).addBox(-0.489F, -2.0959F, -1.0635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8867F, 1.495F, -6.4586F, 1.4485F, 0.0564F, 0.0125F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(33, 107).addBox(-0.489F, -1.5248F, 1.4079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.8867F, 1.495F, -6.4586F, 2.7574F, 0.0564F, 0.0125F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(107, 88).addBox(-0.3963F, 1.8606F, 2.6994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3868F, 0.2716F, -12.6714F, 0.0958F, 0.0345F, 0.0091F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(109, 64).addBox(-0.0855F, 0.7927F, -0.7995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 109).addBox(-0.0855F, 0.6927F, -1.5995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(107, 85).addBox(-0.0855F, 0.6927F, -2.3995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 110).addBox(-0.0855F, 0.5927F, -3.1995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1368F, 1.0716F, -9.8714F, 0.0937F, 0.0345F, 0.0264F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(35, 71).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8207F, 3.0958F, -2.845F, -1.7182F, 0.3282F, -0.0509F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(83, 63).addBox(-0.2298F, -2.7434F, 6.0753F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3868F, 2.4716F, -12.6714F, -0.1395F, 0.0F, -0.003F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(95, 88).addBox(-0.4554F, -1.1646F, 4.2521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3868F, 2.4716F, -12.6714F, -0.0435F, 0.0344F, -0.01F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(102, 75).addBox(-0.5F, -0.65F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.4171F, 0.6634F, -3.3564F, 0.4843F, 0.3296F, 0.1507F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(86, 92).addBox(-0.5F, -0.55F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.48F, -0.0268F, -3.349F, 2.3475F, 0.0F, 0.0F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(36, 98).addBox(-0.5F, -2.85F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.48F, -0.472F, -2.8088F, -2.4522F, 0.0F, 0.0F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(92, 6).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.48F, -0.8685F, -2.232F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(102, 87).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.48F, -0.024F, 1.1884F, -1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(108, 55).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.48F, -0.6839F, 0.9547F, -2.8013F, 0.0F, 0.0F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(102, 83).addBox(-0.5F, -1.85F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.48F, -1.1832F, 0.4641F, 2.3475F, 0.0F, 0.0F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(7, 93).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.48F, -1.3702F, -0.2105F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(74, 103).addBox(-0.5F, -0.175F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.48F, -1.3217F, -0.8842F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(103, 56).addBox(-0.5F, -0.175F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.48F, -1.1464F, -1.5619F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(103, 52).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.48F, -0.0329F, -2.016F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(106, 25).addBox(-0.8151F, -1.7743F, -1.0194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(106, 14).addBox(-0.8151F, -1.3743F, -1.0194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.8084F, 2.5006F, -2.7759F, 0.3402F, 0.3185F, 0.0F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(0, 93).addBox(-0.5F, -1.65F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.48F, 2.7903F, -3.6486F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(15, 107).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4458F, 1.3732F, -2.8692F, -2.3522F, 0.2449F, 0.0775F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(106, 79).addBox(-0.8151F, -0.1333F, -1.1852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.8084F, 2.5006F, -2.7759F, -1.7193F, 0.3185F, 0.0F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(87, 18).addBox(-0.8151F, -0.1333F, -1.4852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.8084F, 2.5006F, -2.7759F, -1.632F, 0.3185F, 0.0F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(5, 106).addBox(-0.8151F, -0.0565F, -0.8833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.8084F, 2.5006F, -2.7759F, -1.0997F, 0.3185F, 0.0F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(0, 83).addBox(-0.4275F, -1.0561F, 0.6281F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(1.4075F, 0.4391F, -0.6014F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(21, 86).addBox(-0.3375F, -0.8266F, -1.0805F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(14, 86).addBox(-0.6625F, -0.8266F, -1.0805F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.4075F, 0.4391F, -0.6014F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(98, 32).addBox(-0.5F, -0.8F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F))
				.texOffs(102, 71).addBox(-0.5F, 0.5F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F))
				.texOffs(69, 102).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.545F, 0.6215F, 2.4702F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(108, 31).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(1.545F, 0.0288F, 2.5641F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(108, 28).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.545F, -0.6787F, 2.0957F, 2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(107, 82).addBox(-0.5F, -0.475F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(1.545F, -0.22F, 1.9065F, 1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(81, 85).addBox(-0.525F, -1.525F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.545F, 1.3224F, 0.4536F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(75, 39).addBox(-0.5F, -0.175F, -0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.545F, 1.4851F, 0.819F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(109, 109).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.545F, 2.3243F, 0.9444F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(111, 23).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.545F, 1.4851F, 0.819F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(107, 0).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.545F, 2.9402F, 1.2503F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(64, 106).addBox(-0.5F, -0.2F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(0, 106).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.545F, 2.9768F, 0.6515F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(104, 106).addBox(-0.5F, -1.25F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.545F, 1.8183F, 0.2238F, 2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(28, 105).addBox(-0.5F, -1.1791F, -0.7251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.5F, 2.7175F, 1.8848F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(94, 28).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8F, 0.5632F, -3.2946F, 0.9952F, -0.9323F, -0.8912F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(10, 101).addBox(-0.5F, -1.0597F, -0.2186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(1.5F, 2.7175F, 1.8848F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(101, 79).addBox(-0.5F, -0.9491F, -0.7619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, -0.5115F, 3.4601F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(54, 105).addBox(-0.6229F, -1.0F, -0.1078F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8184F, -1.2559F, 1.0343F, 0.1863F, -0.4734F, -0.0781F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(89, 105).addBox(-0.5544F, -1.0F, -0.9074F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8184F, -1.2559F, 1.0343F, 0.2682F, -0.8992F, -0.2042F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(108, 58).addBox(-0.8F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.1304F, -1.997F, 4.1581F, 2.8092F, -0.2523F, 0.2669F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(14, 91).addBox(-1.5F, -0.2F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.57F, -0.454F, 3.883F, 3.0342F, -0.4011F, -0.4083F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(90, 101).addBox(-0.5F, -1.0122F, -0.4139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.5F, -0.5115F, 3.4601F, 1.1606F, 0.0F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.3F, 0.3064F, -4.1747F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(87, 28).mirror().addBox(-0.825F, -0.1275F, -1.5985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1368F, 1.0716F, -9.8714F, 0.1805F, 0.0019F, -0.0336F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(30, 110).mirror().addBox(-0.8399F, -0.4702F, -2.4849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1368F, 1.0716F, -9.8714F, 0.417F, -0.034F, -0.0036F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(100, 46).mirror().addBox(-0.8323F, -0.6035F, 0.407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1368F, 1.0716F, -9.8714F, -1.5812F, -0.034F, 0.0018F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(20, 108).mirror().addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5301F, 1.9958F, -8.7862F, 0.0079F, -0.0954F, 0.0141F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(80, 101).mirror().addBox(-0.9755F, 0.5517F, 0.5158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1368F, 1.0716F, -9.8714F, -1.5114F, -0.032F, 0.0072F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(94, 105).mirror().addBox(-0.9755F, 0.8115F, -2.9598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1368F, 1.0716F, -9.8714F, -0.0715F, -0.032F, 0.0072F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(104, 10).mirror().addBox(-0.9755F, -2.8924F, -0.7722F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1368F, 1.0716F, -9.8714F, 1.8047F, -0.032F, 0.0072F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(10, 110).mirror().addBox(-0.9755F, -0.9237F, -3.3935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1368F, 1.0716F, -9.8714F, 0.4958F, -0.032F, 0.0072F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(79, 76).mirror().addBox(-0.8399F, 0.1333F, -1.1797F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1368F, 1.0716F, -9.8714F, 0.1639F, -0.034F, -0.0036F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-0.65F, -1.0F, -1.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.6963F, 0.8023F, -4.8823F, 0.221F, 0.0043F, -0.18F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-0.75F, -1.0F, -1.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6963F, 0.8023F, -4.8823F, 0.2218F, -0.0808F, -0.1991F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(59, 71).mirror().addBox(-0.5078F, -1.2635F, 2.8612F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3868F, 2.4716F, -12.6714F, 0.1766F, -0.022F, -0.1611F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(9, 79).mirror().addBox(-0.4909F, -0.6219F, 4.6734F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3868F, 2.4716F, -12.6714F, 0.2201F, -0.0381F, -0.0393F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(94, 80).mirror().addBox(-1.1753F, -0.5504F, -2.6039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.1368F, 1.0716F, -9.8714F, 0.3473F, -0.0324F, -0.005F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(94, 16).mirror().addBox(-1.1753F, -0.4068F, 0.5222F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1368F, 1.0716F, -9.8714F, -2.7245F, -0.0324F, -0.005F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(104, 109).mirror().addBox(-1.1753F, 1.8781F, -0.2468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-0.1368F, 1.0716F, -9.8714F, -1.3108F, -0.0324F, -0.005F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(109, 106).mirror().addBox(-1.1753F, 1.8951F, -1.0431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1368F, 1.0716F, -9.8714F, -1.0054F, -0.0324F, -0.005F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(59, 106).mirror().addBox(-0.511F, -0.8715F, -1.0938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(93, 92).mirror().addBox(-0.511F, -0.4715F, -0.6188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(69, 106).mirror().addBox(-0.511F, -0.8715F, 0.6812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(87, 14).mirror().addBox(-0.511F, -0.8715F, -0.9188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.8867F, 1.495F, -6.4586F, 0.1395F, -0.0564F, -0.0125F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(105, 103).mirror().addBox(-0.511F, 0.6885F, 0.5622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.8867F, 1.495F, -6.4586F, 1.143F, -0.0564F, -0.0125F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(107, 73).mirror().addBox(-0.511F, 0.9976F, -0.7519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(74, 107).mirror().addBox(-0.511F, 0.9976F, -1.8519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(107, 70).mirror().addBox(-0.511F, 0.9976F, -1.2519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8867F, 1.495F, -6.4586F, 1.972F, -0.0564F, -0.0125F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(34, 103).mirror().addBox(-0.511F, -1.1259F, -1.8554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.8867F, 1.495F, -6.4586F, -3.0894F, -0.0564F, -0.0125F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(87, 10).mirror().addBox(-0.511F, -0.8334F, -2.6069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8867F, 1.495F, -6.4586F, 2.8883F, -0.0564F, -0.0125F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(59, 86).mirror().addBox(-0.511F, -0.623F, -1.4798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(86, 49).mirror().addBox(-0.511F, -1.023F, -1.4798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.8867F, 1.495F, -6.4586F, 3.0192F, -0.0564F, -0.0125F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(107, 20).mirror().addBox(-0.511F, -0.5803F, 0.0149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(107, 17).mirror().addBox(-0.511F, 0.8947F, 0.7899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(107, 67).mirror().addBox(-0.511F, 0.2197F, 0.0149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 107).mirror().addBox(-0.511F, 0.0197F, 0.0149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.8867F, 1.495F, -6.4586F, -2.3913F, -0.0564F, -0.0125F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(103, 31).mirror().addBox(-0.6109F, -2.0035F, -1.5962F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.8867F, 1.495F, -6.4586F, 0.794F, -0.0564F, -0.0125F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(107, 49).mirror().addBox(-0.6109F, -1.8918F, -1.1617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(43, 107).mirror().addBox(-0.6109F, -1.5668F, -1.1617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(38, 107).mirror().addBox(-0.511F, -2.0959F, -1.0635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8867F, 1.495F, -6.4586F, 1.4485F, -0.0564F, -0.0125F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(33, 107).mirror().addBox(-0.511F, -1.5248F, 1.4079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.8867F, 1.495F, -6.4586F, 2.7574F, -0.0564F, -0.0125F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(107, 88).mirror().addBox(-0.6037F, 1.8606F, 2.6994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3868F, 0.2716F, -12.6714F, 0.0958F, -0.0345F, -0.0091F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(109, 64).mirror().addBox(-0.9145F, 0.7927F, -0.7995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(63, 109).mirror().addBox(-0.9145F, 0.6927F, -1.5995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(107, 85).mirror().addBox(-0.9145F, 0.6927F, -2.3995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 110).mirror().addBox(-0.9145F, 0.5927F, -3.1995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1368F, 1.0716F, -9.8714F, 0.0937F, -0.0345F, -0.0264F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(35, 71).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8207F, 3.0958F, -2.845F, -1.7182F, -0.3282F, 0.0509F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(83, 63).mirror().addBox(-0.7701F, -2.7434F, 6.0753F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3868F, 2.4716F, -12.6714F, -0.1395F, 0.0F, 0.003F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(95, 88).mirror().addBox(-0.5446F, -1.1646F, 4.2521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3868F, 2.4716F, -12.6714F, -0.0435F, -0.0344F, 0.01F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(102, 75).mirror().addBox(-0.5F, -0.65F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.4171F, 0.6634F, -3.3564F, 0.4843F, -0.3296F, -0.1507F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(86, 92).mirror().addBox(-0.5F, -0.55F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -0.0268F, -3.349F, 2.3475F, 0.0F, 0.0F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(36, 98).mirror().addBox(-0.5F, -2.85F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -0.472F, -2.8088F, -2.4522F, 0.0F, 0.0F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(92, 6).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -0.8685F, -2.232F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(102, 87).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -0.024F, 1.1884F, -1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(108, 55).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -0.6839F, 0.9547F, -2.8013F, 0.0F, 0.0F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(102, 83).mirror().addBox(-0.5F, -1.85F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.1832F, 0.4641F, 2.3475F, 0.0F, 0.0F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(7, 93).mirror().addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.3702F, -0.2105F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(74, 103).mirror().addBox(-0.5F, -0.175F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.3217F, -0.8842F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(103, 56).mirror().addBox(-0.5F, -0.175F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.1464F, -1.5619F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(103, 52).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -0.0329F, -2.016F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(106, 25).mirror().addBox(-0.1849F, -1.7743F, -1.0194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(106, 14).mirror().addBox(-0.1849F, -1.3743F, -1.0194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.8084F, 2.5006F, -2.7759F, 0.3402F, -0.3185F, 0.0F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-0.5F, -1.65F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 2.7903F, -3.6486F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(15, 107).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4458F, 1.3732F, -2.8692F, -2.3522F, -0.2449F, -0.0775F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(106, 79).mirror().addBox(-0.1849F, -0.1333F, -1.1852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.8084F, 2.5006F, -2.7759F, -1.7193F, -0.3185F, 0.0F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(87, 18).mirror().addBox(-0.1849F, -0.1333F, -1.4852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.8084F, 2.5006F, -2.7759F, -1.632F, -0.3185F, 0.0F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(5, 106).mirror().addBox(-0.1849F, -0.0565F, -0.8833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.8084F, 2.5006F, -2.7759F, -1.0997F, -0.3185F, 0.0F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.5725F, -1.0561F, 0.6281F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1503F)).mirror(false), PartPose.offsetAndRotation(-1.4075F, 0.4391F, -0.6014F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(21, 86).mirror().addBox(-0.6625F, -0.8266F, -1.0805F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(14, 86).mirror().addBox(-0.3375F, -0.8266F, -1.0805F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4075F, 0.4391F, -0.6014F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(98, 32).mirror().addBox(-0.5F, -0.8F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(102, 71).mirror().addBox(-0.5F, 0.5F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(69, 102).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 0.6215F, 2.4702F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(108, 31).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 0.0288F, 2.5641F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(108, 28).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.545F, -0.6787F, 2.0957F, 2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(107, 82).mirror().addBox(-0.5F, -0.475F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-1.545F, -0.22F, 1.9065F, 1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(81, 85).mirror().addBox(-0.475F, -1.525F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 1.3224F, 0.4536F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(75, 39).mirror().addBox(-0.5F, -0.175F, -0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 1.4851F, 0.819F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(109, 109).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 2.3243F, 0.9444F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(111, 23).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 1.4851F, 0.819F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(107, 0).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 2.9402F, 1.2503F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(64, 106).mirror().addBox(-0.5F, -0.2F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(0, 106).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 2.9768F, 0.6515F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(104, 106).mirror().addBox(-0.5F, -1.25F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 1.8183F, 0.2238F, 2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(28, 105).mirror().addBox(-0.5F, -1.1791F, -0.7251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.7175F, 1.8848F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(94, 28).mirror().addBox(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 0.5632F, -3.2946F, 0.9952F, 0.9323F, 0.8912F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(10, 101).mirror().addBox(-0.5F, -1.0597F, -0.2186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.7175F, 1.8848F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(101, 79).mirror().addBox(-0.5F, -0.9491F, -0.7619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.5115F, 3.4601F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(54, 105).mirror().addBox(-0.3771F, -1.0F, -0.1078F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8184F, -1.2559F, 1.0343F, 0.1863F, 0.4734F, 0.0781F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(89, 105).mirror().addBox(-0.4456F, -1.0F, -0.9074F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8184F, -1.2559F, 1.0343F, 0.2682F, 0.8992F, 0.2042F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(108, 58).mirror().addBox(-0.2F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.1304F, -1.997F, 4.1581F, 2.8092F, 0.2523F, -0.2669F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(14, 91).mirror().addBox(-0.5F, -0.2F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.57F, -0.454F, 3.883F, 3.0342F, 0.4011F, 0.4083F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(90, 101).mirror().addBox(-0.5F, -1.0122F, -0.4139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.5115F, 3.4601F, 1.1606F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5325F, 4.977F, -9.2382F, 0.6301F, -0.0879F, -1.1861F));

		PartDefinition cube_r339 = Rightupperarm.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(109, 3).addBox(-0.5F, -0.2F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(99, 108).addBox(-0.5F, -1.0F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.3607F, 1.4705F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r340 = Rightupperarm.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(39, 103).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.695F, 0.7206F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r341 = Rightupperarm.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(0, 109).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(108, 97).addBox(-0.5F, 0.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.3416F, -0.0686F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r342 = Rightupperarm.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(108, 94).addBox(-0.5F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.5647F, 0.0088F, 1.6581F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4051F, 4.3288F, 2.1593F, -0.8294F, 0.1175F, 0.1384F));

		PartDefinition cube_r343 = Rightlowerarm.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(15, 101).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 1.4905F, -0.681F, -2.8798F, 0.0F, 3.1416F));

		PartDefinition cube_r344 = Rightlowerarm.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(60, 97).addBox(-0.5F, -2.3F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9591F, 2.2308F, -0.1615F, 0.176F, 0.3834F, 0.2929F));

		PartDefinition cube_r345 = Righthand.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(95, 101).addBox(-0.5F, -1.4F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.5118F, 1.1407F, 0.2983F, 1.8207F, -0.5866F, -0.3886F));

		PartDefinition cube_r346 = Righthand.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(98, 52).addBox(-0.5F, -0.7F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.5118F, 1.1407F, 0.2983F, 0.8607F, -0.5866F, -0.3886F));

		PartDefinition cube_r347 = Righthand.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(41, 98).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5118F, 1.1407F, 0.2983F, 0.6426F, -0.5866F, -0.3886F));

		PartDefinition cube_r348 = Righthand.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(53, 77).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.9F, 0.6F, -0.6F, 0.1577F, -0.9347F, -0.2508F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5125F, 4.977F, -9.2382F, 0.1985F, 0.1787F, 1.0539F));

		PartDefinition cube_r349 = Leftupperarm.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(109, 3).mirror().addBox(-0.5F, -0.2F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(99, 108).mirror().addBox(-0.5F, -1.0F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.3607F, 1.4705F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r350 = Leftupperarm.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(39, 103).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.695F, 0.7206F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r351 = Leftupperarm.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(108, 97).mirror().addBox(-0.5F, 0.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3416F, -0.0686F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r352 = Leftupperarm.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(108, 94).mirror().addBox(-0.5F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5647F, 0.0088F, 1.6581F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4051F, 4.3288F, 2.1593F, -0.6985F, -0.1175F, -0.1384F));

		PartDefinition cube_r353 = Leftlowerarm.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(15, 101).mirror().addBox(-0.5F, -0.8F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4905F, -0.681F, -2.8798F, 0.0F, -3.1416F));

		PartDefinition cube_r354 = Leftlowerarm.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(60, 97).mirror().addBox(-0.5F, -2.3F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3F, 0.0F, 0.0F, -3.1416F, 0.0F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9591F, 2.2308F, -0.1615F, 0.176F, -0.3834F, -0.2929F));

		PartDefinition cube_r355 = Lefthand.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(95, 101).mirror().addBox(-0.5F, -1.4F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.5118F, 1.1407F, 0.2983F, 1.8207F, 0.5866F, 0.3886F));

		PartDefinition cube_r356 = Lefthand.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(98, 52).mirror().addBox(-0.5F, -0.7F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.5118F, 1.1407F, 0.2983F, 0.8607F, 0.5866F, 0.3886F));

		PartDefinition cube_r357 = Lefthand.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(41, 98).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5118F, 1.1407F, 0.2983F, 0.6426F, 0.5866F, 0.3886F));

		PartDefinition cube_r358 = Lefthand.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(53, 77).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.6F, -0.6F, 0.1577F, 0.9347F, 0.2508F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3915F, 6.739F, -9.3891F, 0.4653F, 0.0183F, -0.0692F));

		PartDefinition cube_r359 = bone.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(91, 53).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1422F, -4.7232F, 9.0941F, 0.6981F, 0.0001F, -0.0032F));

		PartDefinition cube_r360 = bone.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(67, 16).addBox(-0.4991F, -0.2911F, 1.6875F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1449F, -3.4268F, 3.5902F, 0.1745F, 0.0001F, -0.0032F));

		PartDefinition cube_r361 = bone.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(90, 67).addBox(-0.4991F, -0.0422F, -0.0906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1449F, -3.4268F, 3.5902F, 0.3054F, 0.0001F, -0.0032F));

		PartDefinition cube_r362 = bone.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(91, 42).addBox(-1.0078F, -0.95F, -0.5403F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.6385F, -2.3676F, 1.9495F, 0.0433F, 0.0094F, -0.0001F));

		PartDefinition cube_r363 = bone.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(91, 38).addBox(-1.0078F, -0.15F, -0.1403F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6385F, -2.3676F, 1.9495F, 0.5233F, 0.0094F, -0.0001F));

		PartDefinition cube_r364 = bone.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(91, 34).addBox(-0.3306F, 0.1567F, -1.272F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(52, 84).addBox(-0.3306F, -0.8433F, -0.672F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3356F, -0.8768F, 0.7051F, -0.9404F, 0.5939F, 0.5914F));

		PartDefinition cube_r365 = bone.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(94, 108).addBox(-0.3997F, -0.9923F, 0.6191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(88, 76).addBox(-0.3306F, -1.2177F, -1.2951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3356F, -0.8768F, 0.7051F, -0.3295F, 0.5939F, 0.5914F));

		PartDefinition cube_r366 = bone.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(84, 44).addBox(-1.5871F, -1.1815F, -0.6124F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.6385F, -1.6676F, 0.5495F, 0.391F, 0.3392F, 0.2085F));

		PartDefinition cube_r367 = bone.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(21, 91).addBox(-1.5871F, 0.3102F, -0.7673F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6385F, -1.6676F, 0.5495F, 0.8273F, 0.3392F, 0.2085F));

		PartDefinition bone2 = Bodyfront.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3715F, 6.739F, -9.3891F, 0.4653F, -0.0183F, 0.0692F));

		PartDefinition cube_r368 = bone2.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(91, 53).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1422F, -4.7232F, 9.0941F, 0.6981F, -0.0001F, 0.0032F));

		PartDefinition cube_r369 = bone2.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(67, 16).mirror().addBox(-0.5009F, -0.2911F, 1.6875F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1449F, -3.4268F, 3.5902F, 0.1745F, -0.0001F, 0.0032F));

		PartDefinition cube_r370 = bone2.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(90, 67).mirror().addBox(-0.5009F, -0.0422F, -0.0906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1449F, -3.4268F, 3.5902F, 0.3054F, -0.0001F, 0.0032F));

		PartDefinition cube_r371 = bone2.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(91, 42).mirror().addBox(0.0078F, -0.95F, -0.5403F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6385F, -2.3676F, 1.9495F, 0.0433F, -0.0094F, 0.0001F));

		PartDefinition cube_r372 = bone2.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(91, 38).mirror().addBox(0.0078F, -0.15F, -0.1403F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6385F, -2.3676F, 1.9495F, 0.5233F, -0.0094F, 0.0001F));

		PartDefinition cube_r373 = bone2.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(91, 34).mirror().addBox(-0.6694F, 0.1567F, -1.272F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(52, 84).mirror().addBox(-0.6694F, -0.8433F, -0.672F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.3356F, -0.8768F, 0.7051F, -0.9404F, -0.5939F, -0.5914F));

		PartDefinition cube_r374 = bone2.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(94, 108).mirror().addBox(-0.6003F, -0.9923F, 0.6191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(88, 76).mirror().addBox(-0.6694F, -1.2177F, -1.2951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3356F, -0.8768F, 0.7051F, -0.3295F, -0.5939F, -0.5914F));

		PartDefinition cube_r375 = bone2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(84, 44).mirror().addBox(0.5871F, -1.1815F, -0.6124F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6385F, -1.6676F, 0.5495F, 0.391F, -0.3392F, -0.2085F));

		PartDefinition cube_r376 = bone2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(21, 91).mirror().addBox(0.5871F, 0.3102F, -0.7673F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6385F, -1.6676F, 0.5495F, 0.8273F, -0.3392F, -0.2085F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -0.6302F, -0.0406F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1562F, 2.932F, 0.1377F, 0.0F, 0.0F));

		PartDefinition cube_r377 = Tailbase.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(38, 90).addBox(0.0F, -0.8082F, -0.5156F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2698F, 2.7594F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r378 = Tailbase.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(74, 8).mirror().addBox(-2.35F, 0.0F, -6.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1302F, 6.4594F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r379 = Tailbase.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(74, 8).addBox(0.35F, 0.0F, -6.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1302F, 6.4594F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r380 = Tailbase.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(109, 112).addBox(0.0F, -1.9235F, 0.0045F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6581F, -0.0435F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r381 = Tailbase.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(65, 112).addBox(0.0F, -1.666F, 0.0045F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6581F, 1.9565F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail2 = Tailbase.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(67, 22).addBox(-0.5F, -0.0721F, 0.003F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5776F, 3.9473F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r382 = tail2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(74, 4).mirror().addBox(-2.35F, 0.0F, -2.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4279F, 2.503F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r383 = tail2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(74, 4).addBox(0.35F, 0.0F, -2.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4279F, 2.503F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r384 = tail2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(47, 86).addBox(0.0F, -1.1697F, -0.7796F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9279F, 3.6029F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r385 = tail2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(68, 112).addBox(0.0F, -1.5706F, 0.0087F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1197F, 1.9979F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r386 = tail2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(112, 67).addBox(0.0F, -1.5334F, 0.0055F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = tail2.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3012F, 3.8798F, 0.1576F, 0.0F, 0.0F));

		PartDefinition cube_r387 = Tailmiddlebase.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(27, 14).mirror().addBox(-1.75F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2508F, 0.0938F, 0.0526F, 0.0871F, 0.0046F));

		PartDefinition cube_r388 = Tailmiddlebase.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(27, 14).addBox(-0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2508F, 0.0938F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r389 = Tailmiddlebase.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1038F, 0.9873F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r390 = Tailmiddlebase.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(84, 112).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2783F, 4.0666F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r391 = Tailmiddlebase.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(113, 54).addBox(0.0F, -1.25F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4004F, 6.5906F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r392 = Tailmiddlebase.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(112, 81).addBox(0.0F, -1.2456F, 0.0044F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.265F, 2.0372F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r393 = Tailmiddlebase.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(20, 101).addBox(0.0F, -0.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7056F, 6.9532F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r394 = Tailmiddlebase.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(46, 94).addBox(0.0F, -1.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3445F, 3.0809F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r395 = Tailmiddlebase.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(10, 97).addBox(0.0F, -1.6206F, 0.0087F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.052F, 0.0856F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail = Tailmiddlebase.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0229F, 7.0076F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r396 = tail.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(62, 41).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2449F, 1.07F, 0.0526F, 0.1046F, 0.0055F));

		PartDefinition cube_r397 = tail.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(62, 41).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2449F, 1.07F, 0.0526F, -0.1046F, -0.0055F));

		PartDefinition cube_r398 = tail.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(28, 50).addBox(-0.5F, -0.5F, 6.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1267F, -6.0203F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r399 = tail.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(113, 34).addBox(0.0F, -0.975F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7389F, 5.5694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r400 = tail.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(113, 31).addBox(0.0F, -1.3F, -0.55F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3255F, 1.5986F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r401 = tail.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(31, 113).addBox(0.0F, -0.8923F, -0.0216F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7949F, 3.0829F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r402 = tail.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(46, 101).addBox(0.0F, -0.2F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6029F, 3.1264F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = tail.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(113, 51).addBox(0.0F, -1.2805F, 4.9585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 6.0F, 0.2261F, 0.0F, 0.0F));

		PartDefinition cube_r403 = Tailmiddleend.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(113, 57).addBox(0.0F, -0.6369F, -0.1278F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6456F, 3.0856F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r404 = Tailmiddleend.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(44, 113).addBox(0.0F, -0.7268F, -0.0255F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5456F, 0.9856F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r405 = Tailmiddleend.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(58, 55).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0456F, 0.4856F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r406 = Tailmiddleend.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(35, 110).addBox(0.0F, -1.2F, -1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1463F, 4.9636F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r407 = Tailmiddleend.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(43, 50).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9153F, 0.8969F, 0.7069F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1108F, 5.9635F, 0.0468F, 0.0F, 0.0F));

		PartDefinition cube_r408 = Tailend.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(112, 71).addBox(0.0F, 0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6027F, 3.6491F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r409 = Tailend.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(20, 72).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4687F, 1.4171F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r410 = Tailend.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(113, 37).addBox(0.0F, -0.375F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9523F, 1.013F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r411 = Tailend.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(52, 19).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5526F, 1.027F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7149F, 5.9495F, -0.0841F, 0.0F, 0.0F));

		PartDefinition cube_r412 = Tailend2.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(81, 112).addBox(0.0F, 7.2F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 112).addBox(0.0F, 8.1F, 15.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0374F, -12.795F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r413 = Tailend2.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(112, 75).addBox(0.0F, 1.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.286F, 0.2973F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r414 = Tailend2.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(52, 27).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1722F, 5.8848F, -0.1539F, 0.0F, 0.0F));

		PartDefinition cube_r415 = Tailend3.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r416 = Tailend3.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(106, 112).addBox(0.0F, 11.4F, 22.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 112).addBox(0.0F, 10.5F, 20.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3049F, -21.7017F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tailend4 = Tailend3.addOrReplaceChild("Tailend4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2217F, 5.874F, -0.2325F, 0.0F, 0.0F));

		PartDefinition cube_r417 = Tailend4.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(94, 111).addBox(0.0F, 14.3F, 28.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 111).addBox(0.0F, 13.5F, 26.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 111).addBox(0.0F, 12.7F, 24.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5266F, -27.5757F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r418 = Tailend4.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(43, 55).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend5 = Tailend4.addOrReplaceChild("Tailend5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1836F, 5.9018F, -0.1016F, 0.0F, 0.0F));

		PartDefinition cube_r419 = Tailend5.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(46, 9).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend6 = Tailend5.addOrReplaceChild("Tailend6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1957F, 5.8092F, -0.0754F, 0.0F, 0.0F));

		PartDefinition cube_r420 = Tailend6.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(47, 39).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend7 = Tailend6.addOrReplaceChild("Tailend7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2371F, 5.8315F, -0.0754F, 0.0F, 0.0F));

		PartDefinition cube_r421 = Tailend7.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(15, 58).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend8 = Tailend7.addOrReplaceChild("Tailend8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 6.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r422 = Tailend8.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(28, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, -0.4433F, -1.9306F, -1.0303F, 0.0F, 0.0F));

		PartDefinition cube_r423 = Rightthigh.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(76, 81).addBox(-1.3F, -1.8F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6637F, 0.6192F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r424 = Rightthigh.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(103, 39).addBox(-0.5F, -0.2F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -0.8612F, 0.946F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r425 = Rightthigh.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(85, 101).addBox(-0.5F, -5.35F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.4322F, -0.0506F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r426 = Rightthigh.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(71, 87).addBox(-0.5F, -3.8F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 4.3835F, 0.7167F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r427 = Rightthigh.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(92, 22).addBox(-0.5F, -3.9F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 8.154F, 2.1107F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r428 = Rightthigh.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(64, 102).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, 13.9669F, 8.4657F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r429 = Rightthigh.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(58, 109).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(53, 109).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 13.5428F, 6.2702F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r430 = Rightthigh.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(76, 85).addBox(-0.5F, -0.8F, 0.45F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 10.5767F, 3.9702F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r431 = Rightthigh.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(79, 109).addBox(-0.5F, -1.0F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(68, 109).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, 14.1936F, 6.4062F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r432 = Rightthigh.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(99, 10).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 11.1131F, 5.6914F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r433 = Rightthigh.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(104, 4).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, 10.5767F, 3.9702F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r434 = Rightthigh.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(49, 99).addBox(-0.5F, -2.975F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, 10.5551F, 3.9577F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r435 = Rightthigh.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(97, 65).addBox(-0.5F, -3.0F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 12.773F, 8.837F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r436 = Rightthigh.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(66, 87).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.2698F, 1.83F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r437 = Rightthigh.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(57, 90).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 3.4507F, 0.804F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r438 = Rightthigh.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(90, 61).addBox(-0.5F, -2.0F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 2.5115F, 0.2769F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r439 = Rightthigh.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(33, 90).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, 0.3459F, 1.4038F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(31, 96).addBox(-1.0F, 0.3288F, -0.817F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 14.2798F, 9.1477F, 2.3688F, 0.0F, 0.0F));

		PartDefinition cube_r440 = Rightshin.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(99, 5).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7F, -0.1708F, 0.8517F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r441 = Rightshin.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(89, 109).addBox(-0.5F, 0.375F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(84, 109).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.7F, -0.3201F, 1.1418F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r442 = Rightshin.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(55, 96).addBox(-0.5F, -4.1897F, -1.2195F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.7F, 3.9818F, 0.4248F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r443 = Rightshin.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(97, 0).addBox(-0.5F, -3.8677F, -0.4215F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 5.3818F, -0.5752F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r444 = Rightshin.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(75, 98).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7F, 0.8504F, 1.7615F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r445 = Rightshin.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(17, 35).addBox(-0.5F, -3.2287F, -0.2682F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 8.3818F, -0.9752F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r446 = Rightshin.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(42, 86).addBox(-0.5F, -3.75F, -0.3021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 5.3818F, -0.5752F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r447 = Rightshin.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(69, 81).addBox(-0.5F, -1.1F, -1.175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.2951F, -0.0933F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r448 = Rightshin.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(29, 77).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 0.2951F, -0.0933F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r449 = Rightshin.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(23, 34).addBox(-0.5F, -3.0F, -0.1F, 1.0F, 20.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 3.8984F, -0.0612F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r450 = Rightshin.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(94, 10).addBox(-0.5F, -1.05F, -0.15F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 1.8288F, 0.583F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r451 = Rightshin.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(43, 63).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 3.3288F, 0.183F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create().texOffs(45, 22).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 21.0841F, -2.3789F, -0.9411F, 0.0F, 0.0F));

		PartDefinition Rightfoot = Rightankle.addOrReplaceChild("Rightfoot", CubeListBuilder.create().texOffs(31, 9).addBox(-1.9F, -0.4F, -2.7F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.8952F, 0.1116F, 1.2545F, 0.0F, 0.0F));

		PartDefinition Rightfoot2 = Rightfoot.addOrReplaceChild("Rightfoot2", CubeListBuilder.create().texOffs(28, 43).addBox(-1.9F, -0.8F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3916F, -2.7038F, -0.3686F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, -0.4433F, -1.9306F, -0.5939F, 0.0F, 0.0F));

		PartDefinition cube_r452 = Leftthigh.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(76, 81).mirror().addBox(-0.7F, -1.8F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6637F, 0.6192F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r453 = Leftthigh.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(103, 39).mirror().addBox(-0.5F, -0.2F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8612F, 0.946F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r454 = Leftthigh.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(85, 101).mirror().addBox(-0.5F, -5.35F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.4322F, -0.0506F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r455 = Leftthigh.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(71, 87).mirror().addBox(-0.5F, -3.8F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.3835F, 0.7167F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r456 = Leftthigh.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(92, 22).mirror().addBox(-0.5F, -3.9F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.154F, 2.1107F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r457 = Leftthigh.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(64, 102).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 13.9669F, 8.4657F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r458 = Leftthigh.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(58, 109).mirror().addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(53, 109).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 13.5428F, 6.2702F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r459 = Leftthigh.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(76, 85).mirror().addBox(-0.5F, -0.8F, 0.45F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 10.5767F, 3.9702F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r460 = Leftthigh.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(79, 109).mirror().addBox(-0.5F, -1.0F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(68, 109).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 14.1936F, 6.4062F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r461 = Leftthigh.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(99, 10).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 11.1131F, 5.6914F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r462 = Leftthigh.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(104, 4).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 10.5767F, 3.9702F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r463 = Leftthigh.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(49, 99).mirror().addBox(-0.5F, -2.975F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 10.5551F, 3.9577F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r464 = Leftthigh.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(97, 65).mirror().addBox(-0.5F, -3.0F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 12.773F, 8.837F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r465 = Leftthigh.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(66, 87).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.2698F, 1.83F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r466 = Leftthigh.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(57, 90).mirror().addBox(-0.5F, 0.0F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.4507F, 0.804F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r467 = Leftthigh.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(90, 61).mirror().addBox(-0.5F, -2.0F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.5115F, 0.2769F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r468 = Leftthigh.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(33, 90).mirror().addBox(-0.5F, 0.0F, -1.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3459F, 1.4038F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(31, 96).mirror().addBox(0.0F, 0.3288F, -0.817F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 14.2798F, 9.1477F, 1.8015F, 0.0F, 0.0F));

		PartDefinition cube_r469 = Leftshin.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(99, 5).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.1708F, 0.8517F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r470 = Leftshin.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(89, 109).mirror().addBox(-0.5F, 0.375F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(84, 109).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.3201F, 1.1418F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r471 = Leftshin.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(55, 96).mirror().addBox(-0.5F, -4.1897F, -1.2195F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 3.9818F, 0.4248F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r472 = Leftshin.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(-0.5F, -3.8677F, -0.4215F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 5.3818F, -0.5752F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r473 = Leftshin.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(75, 98).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.8504F, 1.7615F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r474 = Leftshin.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(17, 35).mirror().addBox(-0.5F, -3.2287F, -0.2682F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 8.3818F, -0.9752F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r475 = Leftshin.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(42, 86).mirror().addBox(-0.5F, -3.75F, -0.3021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 5.3818F, -0.5752F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r476 = Leftshin.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(69, 81).mirror().addBox(-0.5F, -1.1F, -1.175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2951F, -0.0933F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r477 = Leftshin.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(29, 77).mirror().addBox(-0.5F, -0.6F, -1.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2951F, -0.0933F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r478 = Leftshin.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(23, 34).mirror().addBox(-0.5F, -3.0F, -0.1F, 1.0F, 20.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.8984F, -0.0612F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r479 = Leftshin.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(94, 10).mirror().addBox(-0.5F, -1.05F, -0.15F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.8288F, 0.583F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r480 = Leftshin.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(43, 63).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.3288F, 0.183F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create().texOffs(45, 22).mirror().addBox(-1.0F, -0.3F, -0.5F, 2.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.01F, 21.0841F, -2.3789F, -0.9411F, 0.0F, 0.0F));

		PartDefinition Leftfoot = Leftankle.addOrReplaceChild("Leftfoot", CubeListBuilder.create().texOffs(31, 9).mirror().addBox(-2.1F, -0.4F, -2.7F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 14.8952F, 0.1116F, 0.2073F, 0.0F, 0.0F));

		PartDefinition Leftfoot2 = Leftfoot.addOrReplaceChild("Leftfoot2", CubeListBuilder.create().texOffs(28, 43).mirror().addBox(-2.1F, -0.8F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3916F, -2.7038F, -0.0195F, 0.0F, 0.0F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9927F, 5.2692F, -0.8091F, -0.0436F, 0.0F, 0.1309F));

		PartDefinition cube_r481 = bone3.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(67, 28).addBox(-0.4F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5432F, -6.1546F, -3.0621F, 0.165F, -0.3834F, -0.1493F));

		PartDefinition cube_r482 = bone3.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(78, 12).addBox(-1.0022F, 0.07F, -1.7079F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 78).addBox(-1.0022F, 0.77F, -1.7079F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0596F, -5.8729F, -1.2645F, -0.7019F, -0.0321F, -0.1922F));

		PartDefinition cube_r483 = bone3.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(78, 22).addBox(-1.0022F, -0.0904F, -1.9476F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0596F, -5.8729F, -1.2645F, -0.222F, -0.0321F, -0.1922F));

		PartDefinition cube_r484 = bone3.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(103, 35).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.574F, -8.0986F, 2.8144F, -0.1347F, -0.0321F, -0.4016F));

		PartDefinition cube_r485 = bone3.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(11, 72).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5179F, -8.1307F, 0.8154F, -0.0038F, -0.0321F, -0.4016F));

		PartDefinition cube_r486 = bone3.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(88, 84).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4545F, -5.4668F, 4.3827F, -0.4469F, -0.0327F, -0.4104F));

		PartDefinition cube_r487 = bone3.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(7, 89).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0791F, -6.9429F, 3.8917F, -0.9705F, -0.0327F, -0.4104F));

		PartDefinition cube_r488 = bone3.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(84, 34).addBox(-0.5F, -1.5F, -3.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0988F, -4.7483F, 3.1755F, -1.4505F, -0.0327F, -0.4104F));

		PartDefinition cube_r489 = bone3.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(102, 67).addBox(-0.4726F, -0.7409F, -0.8017F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2453F, -7.2638F, 3.9941F, -0.0792F, 0.009F, -0.405F));

		PartDefinition cube_r490 = bone3.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(0, 97).addBox(-0.4886F, 1.1103F, -1.8525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0596F, -5.8729F, -1.2645F, 0.8007F, -0.0396F, -0.0242F));

		PartDefinition cube_r491 = bone3.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(97, 20).addBox(-0.4886F, 3.7524F, -1.6809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0596F, -5.8729F, -1.2645F, 0.7571F, -0.0396F, -0.0242F));

		PartDefinition cube_r492 = bone3.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(91, 96).addBox(-0.4886F, 6.4043F, -1.1065F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0596F, -5.8729F, -1.2645F, 0.6698F, -0.0396F, -0.0242F));

		PartDefinition cube_r493 = bone3.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(81, 96).addBox(-0.4886F, 9.0094F, -0.7851F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0596F, -5.8729F, -1.2645F, 0.6349F, -0.0396F, -0.0242F));

		PartDefinition cube_r494 = bone3.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(24, 100).addBox(-0.4886F, 11.5631F, 0.2441F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0596F, -5.8729F, -1.2645F, 0.5476F, -0.0396F, -0.0242F));

		PartDefinition cube_r495 = bone3.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(98, 57).addBox(-0.5066F, 9.8287F, 0.8105F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0715F, -4.9627F, -0.4583F, 0.5302F, -0.04F, -0.0235F));

		PartDefinition cube_r496 = bone3.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(86, 96).addBox(-0.5066F, 7.3309F, -0.0697F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0715F, -4.9627F, -0.4583F, 0.6174F, -0.04F, -0.0235F));

		PartDefinition cube_r497 = bone3.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(96, 96).addBox(-0.5066F, 4.7518F, -0.3329F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0715F, -4.9627F, -0.4583F, 0.6523F, -0.04F, -0.0235F));

		PartDefinition cube_r498 = bone3.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(5, 97).addBox(-0.5066F, 2.1736F, -0.7663F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 97).addBox(-0.5066F, -0.4264F, -0.7663F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0715F, -4.9627F, -0.4583F, 0.7396F, -0.04F, -0.0235F));

		PartDefinition cube_r499 = bone3.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(29, 101).addBox(-0.5066F, -0.4976F, -1.0841F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0715F, -4.9627F, -0.4583F, 0.9578F, -0.04F, -0.0235F));

		PartDefinition cube_r500 = bone3.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(60, 77).addBox(-0.5F, -0.8F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.2771F, -6.7758F, -6.1672F, -3.0631F, -0.3289F, -0.3595F));

		PartDefinition cube_r501 = bone3.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(77, 49).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6981F, -6.491F, -7.0284F, -2.714F, -0.3289F, -0.3595F));

		PartDefinition cube_r502 = bone3.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(108, 40).addBox(-0.5F, -0.9F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.145F, -8.2319F, -6.5104F, -1.7977F, -0.3289F, -0.3595F));

		PartDefinition cube_r503 = bone3.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(91, 57).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.145F, -8.2319F, -6.5104F, -0.9687F, -0.3289F, -0.3595F));

		PartDefinition cube_r504 = bone3.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(85, 5).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9066F, -8.4807F, -4.6779F, 0.2531F, -0.3289F, -0.3595F));

		PartDefinition cube_r505 = bone3.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(85, 0).addBox(-1.0083F, -1.7F, -1.8399F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.9894F, -8.5011F, -2.8984F, 1.693F, -0.3289F, -0.3595F));

		PartDefinition cube_r506 = bone3.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(98, 37).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4922F, -8.3134F, -2.1398F, -0.0998F, -0.0321F, -0.4016F));

		PartDefinition cube_r507 = bone3.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(73, 54).addBox(-0.5F, -2.05F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.7197F, -6.3805F, -0.7551F, -0.0736F, -0.0321F, -0.4016F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9927F, 5.2692F, -0.8091F, -0.0436F, 0.0F, -0.1309F));

		PartDefinition cube_r508 = bone4.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(67, 28).mirror().addBox(-0.6F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5432F, -6.1546F, -3.0621F, 0.165F, 0.3834F, 0.1493F));

		PartDefinition cube_r509 = bone4.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(78, 12).mirror().addBox(0.0022F, 0.07F, -1.7079F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 78).mirror().addBox(0.0022F, 0.77F, -1.7079F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0596F, -5.8729F, -1.2645F, -0.7019F, 0.0321F, 0.1922F));

		PartDefinition cube_r510 = bone4.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(78, 22).mirror().addBox(0.0022F, -0.0904F, -1.9476F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0596F, -5.8729F, -1.2645F, -0.222F, 0.0321F, 0.1922F));

		PartDefinition cube_r511 = bone4.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(103, 35).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.574F, -8.0986F, 2.8144F, -0.1347F, 0.0321F, 0.4016F));

		PartDefinition cube_r512 = bone4.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(11, 72).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5179F, -8.1307F, 0.8154F, -0.0038F, 0.0321F, 0.4016F));

		PartDefinition cube_r513 = bone4.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(88, 84).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4545F, -5.4668F, 4.3827F, -0.4469F, 0.0327F, 0.4104F));

		PartDefinition cube_r514 = bone4.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(7, 89).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.0791F, -6.9429F, 3.8917F, -0.9705F, 0.0327F, 0.4104F));

		PartDefinition cube_r515 = bone4.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(84, 34).mirror().addBox(-0.5F, -1.5F, -3.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0988F, -4.7483F, 3.1755F, -1.4505F, 0.0327F, 0.4104F));

		PartDefinition cube_r516 = bone4.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(102, 67).mirror().addBox(-0.5274F, -0.7409F, -0.8017F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2453F, -7.2638F, 3.9941F, -0.0792F, -0.009F, 0.405F));

		PartDefinition cube_r517 = bone4.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-0.5114F, 1.1103F, -1.8525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0596F, -5.8729F, -1.2645F, 0.8007F, 0.0396F, 0.0242F));

		PartDefinition cube_r518 = bone4.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(97, 20).mirror().addBox(-0.5114F, 3.7524F, -1.6809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0596F, -5.8729F, -1.2645F, 0.7571F, 0.0396F, 0.0242F));

		PartDefinition cube_r519 = bone4.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(91, 96).mirror().addBox(-0.5114F, 6.4043F, -1.1065F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0596F, -5.8729F, -1.2645F, 0.6698F, 0.0396F, 0.0242F));

		PartDefinition cube_r520 = bone4.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(81, 96).mirror().addBox(-0.5114F, 9.0094F, -0.7851F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0596F, -5.8729F, -1.2645F, 0.6349F, 0.0396F, 0.0242F));

		PartDefinition cube_r521 = bone4.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(24, 100).mirror().addBox(-0.5114F, 11.5631F, 0.2441F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0596F, -5.8729F, -1.2645F, 0.5476F, 0.0396F, 0.0242F));

		PartDefinition cube_r522 = bone4.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(98, 57).mirror().addBox(-0.4934F, 9.8287F, 0.8105F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0715F, -4.9627F, -0.4583F, 0.5302F, 0.04F, 0.0235F));

		PartDefinition cube_r523 = bone4.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(86, 96).mirror().addBox(-0.4934F, 7.3309F, -0.0697F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0715F, -4.9627F, -0.4583F, 0.6174F, 0.04F, 0.0235F));

		PartDefinition cube_r524 = bone4.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(96, 96).mirror().addBox(-0.4934F, 4.7518F, -0.3329F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0715F, -4.9627F, -0.4583F, 0.6523F, 0.04F, 0.0235F));

		PartDefinition cube_r525 = bone4.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(5, 97).mirror().addBox(-0.4934F, 2.1736F, -0.7663F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 97).mirror().addBox(-0.4934F, -0.4264F, -0.7663F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0715F, -4.9627F, -0.4583F, 0.7396F, 0.04F, 0.0235F));

		PartDefinition cube_r526 = bone4.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(29, 101).mirror().addBox(-0.4934F, -0.4976F, -1.0841F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0715F, -4.9627F, -0.4583F, 0.9578F, 0.04F, 0.0235F));

		PartDefinition cube_r527 = bone4.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(60, 77).mirror().addBox(-0.5F, -0.8F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-0.2771F, -6.7758F, -6.1672F, -3.0631F, 0.3289F, 0.3595F));

		PartDefinition cube_r528 = bone4.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(77, 49).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6981F, -6.491F, -7.0284F, -2.714F, 0.3289F, 0.3595F));

		PartDefinition cube_r529 = bone4.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(108, 40).mirror().addBox(-0.5F, -0.9F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.145F, -8.2319F, -6.5104F, -1.7977F, 0.3289F, 0.3595F));

		PartDefinition cube_r530 = bone4.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(91, 57).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.145F, -8.2319F, -6.5104F, -0.9687F, 0.3289F, 0.3595F));

		PartDefinition cube_r531 = bone4.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(85, 5).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.9066F, -8.4807F, -4.6779F, 0.2531F, 0.3289F, 0.3595F));

		PartDefinition cube_r532 = bone4.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(0.0083F, -1.7F, -1.8399F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.9894F, -8.5011F, -2.8984F, 1.693F, 0.3289F, 0.3595F));

		PartDefinition cube_r533 = bone4.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(98, 37).mirror().addBox(-0.5F, -0.1F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.4922F, -8.3134F, -2.1398F, -0.0998F, 0.0321F, 0.4016F));

		PartDefinition cube_r534 = bone4.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(73, 54).mirror().addBox(-0.5F, -2.05F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.7197F, -6.3805F, -0.7551F, -0.0736F, 0.0321F, 0.4016F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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