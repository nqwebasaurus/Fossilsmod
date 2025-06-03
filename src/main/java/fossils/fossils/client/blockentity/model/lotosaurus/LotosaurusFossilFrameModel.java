package fossils.fossils.client.blockentity.model.lotosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LotosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart Belly;
	private final ModelPart Bodyfront;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart Upperjawback;
	private final ModelPart Upperjawmiddle;
	private final ModelPart Upperjawfront;
	private final ModelPart Faceslopefront;
	private final ModelPart Faceslopemiddle;
	private final ModelPart Lefteye;
	private final ModelPart Righteye;
	private final ModelPart Lowerjawback;
	private final ModelPart Lowerjawmiddleback;
	private final ModelPart Lowerjawmiddlefront;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerjawslopeback;
	private final ModelPart Lowerjawslopefront;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart Bellyhump;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Tailbasehump;
	private final ModelPart Hiphumpfront;
	private final ModelPart Hiphumpback;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Rightheel;
	private final ModelPart Righttoes;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Leftheel;
	private final ModelPart Lefttoes;

	public LotosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.body2 = this.Hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.Belly = this.body.getChild("Belly");
		this.Bodyfront = this.Belly.getChild("Bodyfront");
		this.neck3 = this.Bodyfront.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.Neck = this.neck2.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Upperjawback = this.Head.getChild("Upperjawback");
		this.Upperjawmiddle = this.Upperjawback.getChild("Upperjawmiddle");
		this.Upperjawfront = this.Upperjawmiddle.getChild("Upperjawfront");
		this.Faceslopefront = this.Upperjawfront.getChild("Faceslopefront");
		this.Faceslopemiddle = this.Upperjawmiddle.getChild("Faceslopemiddle");
		this.Lefteye = this.Upperjawback.getChild("Lefteye");
		this.Righteye = this.Upperjawback.getChild("Righteye");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.Lowerjawmiddleback = this.Lowerjawback.getChild("Lowerjawmiddleback");
		this.Lowerjawmiddlefront = this.Lowerjawmiddleback.getChild("Lowerjawmiddlefront");
		this.Lowerjawfront = this.Lowerjawmiddlefront.getChild("Lowerjawfront");
		this.Lowerjawslopeback = this.Lowerjawmiddleback.getChild("Lowerjawslopeback");
		this.Lowerjawslopefront = this.Lowerjawslopeback.getChild("Lowerjawslopefront");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.Bellyhump = this.Belly.getChild("Bellyhump");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.Tailmiddleend = this.Tailmiddle.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Tailbasehump = this.Tailbase.getChild("Tailbasehump");
		this.Hiphumpfront = this.Hips.getChild("Hiphumpfront");
		this.Hiphumpback = this.Hiphumpfront.getChild("Hiphumpback");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Rightheel = this.Rightshin.getChild("Rightheel");
		this.Righttoes = this.Rightheel.getChild("Righttoes");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Leftheel = this.Leftshin.getChild("Leftheel");
		this.Lefttoes = this.Leftheel.getChild("Lefttoes");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(0.0F, -3.75F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-4.0F, -11.85F, -5.9F, 0.0F, 0.5585F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(1.65F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-4.0F, -11.85F, -5.9F, 0.5585F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-1.05F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -14.55F, 8.6F, 0.1222F, 0.0F, 1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -2.45F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -14.55F, 8.6F, 0.0F, 0.1222F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0252F, 8.4832F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(28, 31).addBox(-0.4F, -0.2F, -2.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 0.3312F, 0.4732F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body2 = Hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4809F, -1.5666F, 0.0354F, 0.1744F, 0.0062F));

		PartDefinition Belly_r1 = body2.addOrReplaceChild("Belly_r1", CubeListBuilder.create().texOffs(37, 38).addBox(-0.5F, 0.6855F, 0.1307F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, 0.1855F, -5.5693F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.0F, 0.044F, 0.1308F, 0.0057F));

		PartDefinition Belly = body.addOrReplaceChild("Belly", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2493F, -5.9347F, 0.111F, 0.0F, 0.0F));

		PartDefinition Belly_r2 = Belly.addOrReplaceChild("Belly_r2", CubeListBuilder.create().texOffs(14, 30).addBox(-0.5F, 0.0F, 0.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9493F, -5.9653F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Belly.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4069F, -5.0662F, 0.1406F, 0.1728F, 0.0243F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(26, 38).addBox(-0.5F, -0.297F, 1.7697F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0466F, -5.7052F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck3 = Bodyfront.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(57, 49).addBox(-0.5F, 0.2F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.8F, -0.0777F, 0.4086F, 0.1306F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2792F, -1.7595F, -0.3526F, 0.116F, -0.0607F));

		PartDefinition Neck_r1 = neck2.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(21, 47).addBox(-0.5F, 0.4553F, 2.3796F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.1F, -5.6F, 0.192F, 0.0F, 0.0F));

		PartDefinition Neck = neck2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6417F, -2.76F, -0.1337F, 0.3464F, 0.0437F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(14, 49).addBox(-0.5F, 0.4553F, -0.1204F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3983F, -2.8177F, 0.192F, 0.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.363F, -2.8704F, 0.5792F, 0.2883F, 0.1765F));

		PartDefinition Upperjawback = Head.addOrReplaceChild("Upperjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3761F, -2.1269F, 0.0424F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle = Upperjawback.addOrReplaceChild("Upperjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.93F, -1.6F, 0.1061F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawmiddle.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.82F, -1.0F, 0.1698F, 0.0F, 0.0F));

		PartDefinition Faceslopefront = Upperjawfront.addOrReplaceChild("Faceslopefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.0F, -2.0F, 0.7391F, 0.0F, 0.0F));

		PartDefinition Faceslopemiddle = Upperjawmiddle.addOrReplaceChild("Faceslopemiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.41F, -1.75F, 0.2546F, 0.0F, 0.0F));

		PartDefinition Lefteye = Upperjawback.addOrReplaceChild("Lefteye", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.45F, 1.1F, -1.9F, -0.0424F, -0.1911F, 0.0F));

		PartDefinition Righteye = Upperjawback.addOrReplaceChild("Righteye", CubeListBuilder.create(), PartPose.offsetAndRotation(1.45F, 1.1F, -1.9F, -0.0424F, 0.1911F, 0.0F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5239F, 0.6731F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddleback = Lowerjawback.addOrReplaceChild("Lowerjawmiddleback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0899F, -2.6656F, 0.0424F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddlefront = Lowerjawmiddleback.addOrReplaceChild("Lowerjawmiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0848F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddlefront.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.1323F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopeback = Lowerjawmiddleback.addOrReplaceChild("Lowerjawslopeback", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 1.9F, -0.12F, -0.1698F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopefront = Lowerjawslopeback.addOrReplaceChild("Lowerjawslopefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.01F, -1.7F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9905F, 6.2235F, -1.0481F, -0.271F, 0.0F, -0.0424F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0985F, 4.1856F, 0.5657F, -0.7652F, 0.0F, 0.0424F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0254F, 6.1692F, -0.3025F, 0.7842F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9905F, 6.2235F, -1.0481F, 0.558F, 0.0F, 0.0424F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0985F, 4.1856F, 0.5657F, -0.8088F, 0.0F, -0.0424F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0254F, 6.1692F, -0.3025F, 0.2596F, 0.0225F, -0.0843F));

		PartDefinition Bellyhump = Belly.addOrReplaceChild("Bellyhump", CubeListBuilder.create(), PartPose.offset(0.0F, -1.2507F, 0.0347F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0443F, 3.3614F, -0.1964F, -0.257F, 0.0505F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(6, 14).addBox(-0.5F, 0.4F, 8.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 8).addBox(-0.5F, 0.4F, 0.4F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0338F, -0.9239F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4911F, 7.9609F, -0.2064F, 0.2565F, -0.0531F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(25, 14).addBox(-0.5F, 0.8F, 6.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(19, 8).addBox(-0.5F, 0.8F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5963F, 0.014F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(21, 17).addBox(-0.5F, 0.0943F, -0.0998F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3698F, 6.9713F, 0.3382F, 0.1281F, 0.0269F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(36, 18).addBox(-0.5F, 0.1F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(39, 21).addBox(-0.5F, 0.1F, 3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0364F, 5.7995F, 0.2916F, 0.3881F, 0.0613F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(15, 38).addBox(-0.5F, 0.1F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0192F, 3.9068F, -0.2336F, 0.345F, 0.0542F));

		PartDefinition Tailbasehump = Tailbase.addOrReplaceChild("Tailbasehump", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5338F, -1.2239F, -0.1061F, 0.0F, 0.0F));

		PartDefinition Hiphumpfront = Hips.addOrReplaceChild("Hiphumpfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4302F, -7.6013F, -0.0637F, 0.0F, 0.0F));

		PartDefinition Hiphumpback = Hiphumpfront.addOrReplaceChild("Hiphumpback", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -5.0F, 6.0F, -0.2122F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1923F, 0.8431F, 0.0365F, -0.41F, -0.0376F, -0.0196F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.926F, -0.1976F, 0.4705F, 0.0F, 0.0F));

		PartDefinition Rightheel = Rightshin.addOrReplaceChild("Rightheel", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.4688F, 0.6196F, -0.0625F, 0.0F, 0.0F));

		PartDefinition Righttoes = Rightheel.addOrReplaceChild("Righttoes", CubeListBuilder.create(), PartPose.offset(0.01F, -0.2772F, -2.799F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1923F, 0.8431F, 0.0365F, 0.2882F, 0.0376F, 0.0196F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.926F, -0.1976F, 0.5142F, 0.0F, 0.0F));

		PartDefinition Leftheel = Leftshin.addOrReplaceChild("Leftheel", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.4688F, 0.6196F, -0.1061F, 0.0F, 0.0F));

		PartDefinition Lefttoes = Leftheel.addOrReplaceChild("Lefttoes", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.2772F, -2.799F, -0.5672F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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